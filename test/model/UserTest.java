package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	public void setupStage1() {
		
	}
	
	@Test
	public void testUser() {
		setupStage1();
		User userTest = new User( "Levi" , "Ackerman" , "9549" , "Ackerman@gmail.com" , "5654" , "Levi" , "images/UserImage/Levi.png");
		
		assertEquals("Levi", userTest.getName());
		assertEquals("Ackerman", userTest.getLastName());
		assertEquals("9549", userTest.getId());
		assertEquals("Ackerman@gmail.com", userTest.getEmail());
		assertEquals("5654", userTest.getPassword());
		assertEquals("Levi", userTest.getNameUser());
		assertEquals("images/UserImage/Levi.png", userTest.getPicture());
		
	}
	
	@Test
	public void testGettersAndSetters() {
		setupStage1();
		User userTest = new User("", "", "", "", "", "", "");
		userTest.setName("Levi");
		userTest.setLastName("Ackerman");
		userTest.setId("9549");
		userTest.setEmail("Ackerman@gmail.com");
		userTest.setPassword("5654");
		userTest.setNameUser("Levi");
		userTest.setPicture("images/UserImage/Levi.png");
		
		assertEquals("Levi", userTest.getName());
		assertEquals("Ackerman", userTest.getLastName());
		assertEquals("9549", userTest.getId());
		assertEquals("Ackerman@gmail.com", userTest.getEmail());
		assertEquals("5654", userTest.getPassword());
		assertEquals("Levi", userTest.getNameUser());
		assertEquals("images/UserImage/Levi.png", userTest.getPicture());
	}
}
