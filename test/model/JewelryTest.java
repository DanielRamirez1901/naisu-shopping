package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JewelryTest {

	public void setupStage1() {
		
	}
	@Test
	void testJewelry() {
		setupStage1();
		Jewelry jewelryTest = new Jewelry( "Collar" , "4555887" , "sDiamond" , 10260000 , 
										   "images/AccessoriesImages/diamond.jpg" , 
										   "jewels" , "Diamante" , "Unisex" );
	
		assertEquals("Collar", jewelryTest.getName());
		assertEquals("4555887", jewelryTest.getCode());
		assertEquals("sDiamond", jewelryTest.getBrand());
		assertEquals(10260000, jewelryTest.getPrice());
		assertEquals("images/AccessoriesImages/diamond.jpg", jewelryTest.getPhoto());
		assertEquals("jewels", jewelryTest.getType());
		assertEquals("Diamante", jewelryTest.getMaterial());
		assertEquals("Unisex", jewelryTest.getGender());
		assertNull(jewelryTest.getRight());
		assertNull(jewelryTest.getLeft());
	}
	
	@Test
	void testGettersAndSetters() {
		setupStage1();
		Jewelry jewelryTest = new Jewelry( " " , " " , " " , 0 , " " , " " , " " , " " );
		
		jewelryTest.setName("Collar");
		jewelryTest.setCode("4555887");
		jewelryTest.setBrand("sDiamond");
		jewelryTest.setPrice(10260000);
		jewelryTest.setPhoto("images/AccessoriesImages/diamond.jpg");
		jewelryTest.setType("jewels");
		jewelryTest.setMaterial("Diamante");
		jewelryTest.setGender("Unisex");
		jewelryTest.setRight(null);
		jewelryTest.setLeft(null);
		
		assertEquals("Collar", jewelryTest.getName());
		assertEquals("4555887", jewelryTest.getCode());
		assertEquals("sDiamond", jewelryTest.getBrand());
		assertEquals(10260000, jewelryTest.getPrice());
		assertEquals("images/AccessoriesImages/diamond.jpg", jewelryTest.getPhoto());
		assertEquals("jewels", jewelryTest.getType());
		assertEquals("Diamante", jewelryTest.getMaterial());
		assertEquals("Unisex", jewelryTest.getGender());
		assertNull(jewelryTest.getRight());
		assertNull(jewelryTest.getLeft());
	}

}
