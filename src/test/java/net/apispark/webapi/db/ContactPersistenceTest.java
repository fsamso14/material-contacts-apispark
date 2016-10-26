package net.apispark.webapi.db;

import net.apispark.webapi.representation.Contact;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ContactPersistenceTest {
	 @Test
	    public void test1() throws Exception {
		 Contact c = new Contact();
		 Contact contactSaved = ContactPersistence.INSTANCE.addContact(c);
	        Assert.assertThat(contactSaved.getId(), is(notNullValue()));
	    }
	 @Test
	 public void test2() throws Exception {
		 Contact c = new Contact();
		 Contact c1 =ContactPersistence.INSTANCE.addContact(c);
		 Contact d1 =ContactPersistence.INSTANCE.getContact(c1.getId());
	     Assert.assertThat(d1.getId(), is(c1.getId()));
	    }
	 
	 @Test
	 public void test3() throws Exception {
		 Contact c = new Contact();
		 Contact c1 =ContactPersistence.INSTANCE.addContact(c);
		 Contact d1 =ContactPersistence.INSTANCE.getContact(c1.getId());
	     Assert.assertThat(d1.getId(), is(c1.getId()));
	    }
}
