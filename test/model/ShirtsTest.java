package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShirtsTest {

	public void setupStage1() {
		
	}
	
	@Test
	void testShirts() {
		Shirt shirtTest = new Shirt( "Suave" , "Para reuniones" , "Camisa" , "645645" , "Snick" , 50000 , "L" , "images/ClothesImages/Shirt.png" , "Camisa Unisex" , 2 , "Rojo" , "Unisex" , "Shirts" );
		
		assertEquals("Suave", shirtTest.getCloth());
		assertEquals("Para reuniones", shirtTest.getTypeShirt());
		assertEquals("Camisa", shirtTest.getName());
		assertEquals("645645", shirtTest.getCode());
		assertEquals("Snick", shirtTest.getBrand());
		assertEquals(50000, shirtTest.getPrice());
		assertEquals("L", shirtTest.getSize());
		assertEquals("images/ClothesImages/Shirt.png", shirtTest.getPhoto());
		assertEquals("Camisa Unisex", shirtTest.getDescription());
		assertEquals(2, shirtTest.getQuantity());
		assertEquals("Rojo", shirtTest.getColor());
		assertEquals("Unisex", shirtTest.getGender());
		assertEquals("Shirts", shirtTest.getType());
	}
	
	@Test
	void testGettersAndSetters() {
		setupStage1();
		Shirt shirtTest = new Shirt( " " ," " ," " , " " , " " , 0 , " " , " " , " " , 0 , " " , " " , " " );

		shirtTest.setCloth("Suave");
		shirtTest.setTypeShirt("Para reuniones");
		shirtTest.setName("Camisa");
		shirtTest.setCode("645645");
		shirtTest.setBrand("Snick");
		shirtTest.setPrice(50000);
		shirtTest.setSize("L");
		shirtTest.setPhoto("images/ClothesImages/Shirt.png");
		shirtTest.setDescription("Camisa unisex");
		shirtTest.setQuantity(2);
		shirtTest.setColor("Rojo");
		shirtTest.setGender("Unisex");
		shirtTest.setType("Shirts");
		
		assertEquals("Suave", shirtTest.getCloth());
		assertEquals("Para reuniones", shirtTest.getTypeShirt());
		assertEquals("Camisa", shirtTest.getName());
		assertEquals("645645", shirtTest.getCode());
		assertEquals("Snick", shirtTest.getBrand());
		assertEquals(50000, shirtTest.getPrice());
		assertEquals("L", shirtTest.getSize());
		assertEquals("images/ClothesImages/Shirt.png", shirtTest.getPhoto());
		assertEquals("Camisa unisex", shirtTest.getDescription());
		assertEquals(2, shirtTest.getQuantity());
		assertEquals("Rojo", shirtTest.getColor());
		assertEquals("Unisex", shirtTest.getGender());
		assertEquals("Shirts", shirtTest.getType());
	}

}
