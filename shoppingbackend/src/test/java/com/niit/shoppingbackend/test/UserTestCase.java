package com.niit.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingbackend");
		context.refresh();
		userDAO=(UserDAO) context.getBean("userDAO");
	}
	
	/*@Test
	public void testAddUser() {
		user = new User();
		user.setName("abc");
		user.setRole("supplier");
		//assertEquals("Successfull added a category inside the table", true, userDAO.add(user));
       assertEquals("successfully",true,userDAO.add(user));
	}*/
	
	/*@Test
	public void testget()
	{
		user=userDAO.get(1);
		 assertEquals("successfully","abc",user.getName());
	
	}*/

	/*@Test
	public void testget()
	{
		user=userDAO.get(1);
		 assertEquals("successfully",true,userDAO.delete(user));
	
	}*/
	
	@Test
	public void testlistcategory()
	{
		
		 assertEquals("successfully",1,userDAO.list().size());
	
	}
	
	
	

	
}
