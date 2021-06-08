package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SellerTest {
	
	public void setupStage1() {
		
	}
	
	
	@Test
	public void testSeller() {
		setupStage1();
		Seller sellerTest = new Seller( "Leo" , "Brigth" , "46565" , "LBrigth@correo.co" , "leoleo" , "LeoBb" , "images/UserImage/Leo.png");
		assertEquals("Leo", sellerTest.getName());
		assertEquals("Brigth", sellerTest.getLastName());
		assertEquals("46565"  , sellerTest.getId());
		assertEquals("LBrigth@correo.co", sellerTest.getEmail());
		assertEquals("leoleo", sellerTest.getPassword());
		assertEquals("LeoBb", sellerTest.getNameUser());
		assertEquals("images/UserImage/Leo.png", sellerTest.getPicture());
		assertNotNull(sellerTest.getSaleHistory());
		assertTrue(sellerTest.getSaleHistory().isEmpty());
		assertNotNull(sellerTest.getJewel());
		assertNotNull(sellerTest.getGlass());
		assertTrue(sellerTest.getJewel().isEmpty());
		assertTrue(sellerTest.getGlass().isEmpty());
	}
	
	@Test
	public void testGettersAndSetters() {
		setupStage1();
		Seller sellerTest = new Seller( " " , " " , " " , " " , " " , " " , " ");
		sellerTest.setName("Leo");
		sellerTest.setLastName("Brigth");
		sellerTest.setId("46565");
		sellerTest.setEmail("LBrigth@correo.co");
		sellerTest.setPassword("leoleo");
		sellerTest.setNameUser("LeoBb");
		sellerTest.setPicture("images/UserImage/Leo.png");
		
		
		assertEquals("Leo", sellerTest.getName());
		assertEquals("Brigth", sellerTest.getLastName());
		assertEquals("46565"  , sellerTest.getId());
		assertEquals("LBrigth@correo.co", sellerTest.getEmail());
		assertEquals("leoleo", sellerTest.getPassword());
		assertEquals("LeoBb", sellerTest.getNameUser());
		assertEquals("images/UserImage/Leo.png", sellerTest.getPicture());
		assertNotNull(sellerTest.getSaleHistory());
		assertTrue(sellerTest.getSaleHistory().isEmpty());
		assertNotNull(sellerTest.getJewel());
		assertNotNull(sellerTest.getGlass());
		assertTrue(sellerTest.getJewel().isEmpty());
		assertTrue(sellerTest.getGlass().isEmpty());
	}

}
