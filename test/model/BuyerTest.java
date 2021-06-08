package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuyerTest {

	
	public void setupStage1() {
		
	}
	
	@Test
	public void testBuyer() {
		setupStage1();
		Buyer buyerTest = new Buyer( "Janna" , "Flitz" , "999" , "Janna999@gmail.com" , "ara123" , "Jvna" , "images/UserImage/Janna.png");
		
		assertEquals("Janna", buyerTest.getName());
		assertEquals("Flitz", buyerTest.getLastName());
		assertEquals("999"  , buyerTest.getId());
		assertEquals("Janna999@gmail.com", buyerTest.getEmail());
		assertEquals("ara123", buyerTest.getPassword());
		assertEquals("Jvna", buyerTest.getNameUser());
		assertEquals("images/UserImage/Janna.png", buyerTest.getPicture());
		assertNotNull(buyerTest.getHistoryAccessories());
		assertNotNull(buyerTest.getHistoryClothing());
		assertTrue(buyerTest.getShoppingCartAccessories().isEmpty());
		assertTrue(buyerTest.getShoppingCartClothing().isEmpty());
	}	


	@Test
	public void testSettersAndGetters() {
		setupStage1();
		Buyer buyerTest = new Buyer( " " , " " , " " , " " , " " , " " , " ");
		buyerTest.setName("Janna");
		buyerTest.setLastName("Flitz");
		buyerTest.setId("999");
		buyerTest.setEmail("Janna999@gmail.com");
		buyerTest.setPassword("ara123");
		buyerTest.setNameUser("Jvna");
		buyerTest.setPicture("images/UserImage/Janna.png");
	
		assertEquals("Janna", buyerTest.getName());
		assertEquals("Flitz", buyerTest.getLastName());
		assertEquals("999"  , buyerTest.getId());
		assertEquals("Janna999@gmail.com", buyerTest.getEmail());
		assertEquals("ara123", buyerTest.getPassword());
		assertEquals("Jvna", buyerTest.getNameUser());
		assertEquals("images/UserImage/Janna.png", buyerTest.getPicture());
		assertNotNull(buyerTest.getHistoryAccessories());
		assertNotNull(buyerTest.getHistoryClothing());
		assertTrue(buyerTest.getShoppingCartAccessories().isEmpty());
		assertTrue(buyerTest.getShoppingCartClothing().isEmpty());
	}
}
