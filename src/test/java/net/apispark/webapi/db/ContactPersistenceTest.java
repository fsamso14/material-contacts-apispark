package net.apispark.webapi.db;

import net.apispark.webapi.representation.Contact;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

public class ContactPersistenceTest {
	 @Test
	    public void test1() throws Exception {
		 Contact c = new Contact();
		 Contact contactSaved = ContactPersistence.INSTANCE.addContact(c);
	        Assert.assertNotEquals(null, contactSaved.getId());
	    }
	 @Test
	 public void test2() throws Exception {
		 Contact c = new Contact();
		 ContactPersistence.INSTANCE.addContact(c);
		 Contact d = ContactPersistence.INSTANCE.getContact(c.getId());
		 ContactPersistence.INSTANCE.addContact(d);
	        Assert.assertEquals(d.getId(), c.getId());
	    }
}
