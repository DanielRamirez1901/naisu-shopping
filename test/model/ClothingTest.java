package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClothingTest {
	
	
	public void setupStage1() {
		
	}
	
	@Test
	void testClothing() {
		Clothing clothingTest = new Clothing( "Camisa" , "654654" , "Snick" , 50000 , "L" , "images/ClothesImages/Shirt.png" , "Camisa unisex" , 2 , "Rojo" , "Unisex" , "Shirts" );
	   
		assertEquals( "Camisa", clothingTest.getName());
	    assertEquals( "654654", clothingTest.getCode());
	    assertEquals( "Snick", clothingTest.getBrand());
	    assertEquals( 50000, clothingTest.getPrice());
	    assertEquals( "L", clothingTest.getSize());
	    assertEquals( "images/ClothesImages/Shirt.png", clothingTest.getPhoto());
	    assertEquals( "Camisa unisex", clothingTest.getDescription());
	    assertEquals( 2 , clothingTest.getQuantity());
	    assertEquals( "Rojo", clothingTest.getColor());
	    assertEquals( "Unisex", clothingTest.getGender());
	    assertEquals( "Shirts", clothingTest.getType());
	}
	
	@Test
	void testGettersAndSetters() {
		setupStage1();
		Clothing clothingTest = new Clothing( " " , " " , " " , 0 , " " , " " , " " , 0 , " " , " " , " " );

		clothingTest.setName("Camisa");
		clothingTest.setCode("654654");
		clothingTest.setBrand("Snick");
		clothingTest.setPrice(50000);
		clothingTest.setSize("L");
		clothingTest.setPhoto("images/ClothesImages/Shirt.png");
		clothingTest.setDescription("Camisa unisex");
		clothingTest.setQuantity(2);
		clothingTest.setColor("Rojo");
		clothingTest.setGender("Unisex");
		clothingTest.setType("Shirts");
		
		assertEquals( "Camisa", clothingTest.getName());
	    assertEquals( "654654", clothingTest.getCode());
	    assertEquals( "Snick", clothingTest.getBrand());
	    assertEquals( 50000, clothingTest.getPrice());
	    assertEquals( "L", clothingTest.getSize());
	    assertEquals( "images/ClothesImages/Shirt.png", clothingTest.getPhoto());
	    assertEquals( "Camisa unisex", clothingTest.getDescription());
	    assertEquals( 2 , clothingTest.getQuantity());
	    assertEquals( "Rojo", clothingTest.getColor());
	    assertEquals( "Unisex", clothingTest.getGender());
	    assertEquals( "Shirts", clothingTest.getType());
	}

}
