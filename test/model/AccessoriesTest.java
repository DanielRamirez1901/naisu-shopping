package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccessoriesTest {
	
	public void setupStage1() {
		
	}
	@Test
	public void testAccessories() {
		setupStage1();
		Accessories accessoriesTest = new Accessories( "Gafas de sol" , "45887" , "glass" , 
														2260000 , "images/AccessoriesImages/glass.png" ,
														"glasses");
		
		assertEquals("Gafas de sol", accessoriesTest.getName());
		assertEquals("45887", accessoriesTest.getCode());
		assertEquals("glass", accessoriesTest.getBrand());
		assertEquals(2260000, accessoriesTest.getPrice());
		assertEquals("images/AccessoriesImages/glass.png", accessoriesTest.getPhoto());
		assertEquals("glasses", accessoriesTest.getType());
		assertNotNull(accessoriesTest.getJewelry());
		assertTrue(accessoriesTest.getJewelry().isEmpty());
	}
	
	@Test
	public void testGettersAndSetters() {
		setupStage1();
		Accessories accessoriesTest = new Accessories( " " , " " , " " , 0 , " " , " " );
		
		accessoriesTest.setName("Gafas de sol");
		accessoriesTest.setCode("45887");
		accessoriesTest.setBrand("glass");
		accessoriesTest.setPrice(2260000);
		accessoriesTest.setPhoto("images/AccessoriesImages/glass.png");
		accessoriesTest.setType("glasses");
		
		
		assertEquals("Gafas de sol", accessoriesTest.getName());
		assertEquals("45887", accessoriesTest.getCode());
		assertEquals("glass", accessoriesTest.getBrand());
		assertEquals(2260000, accessoriesTest.getPrice());
		assertEquals("images/AccessoriesImages/glass.png", accessoriesTest.getPhoto());
		assertEquals("glasses", accessoriesTest.getType());
		assertNotNull(accessoriesTest.getJewelry());
		assertTrue(accessoriesTest.getJewelry().isEmpty());
	}

}
