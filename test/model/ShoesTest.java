package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ShoesTest {

	public void setupStage1() {
		
	}
	@Test
	public void testShoes() {
		setupStage1();
		Shoes shoesTest = new Shoes( "Sandalias" , "6546454" , "Snick" , 60000 , 
									"42" , "images/ClothesImage/rider.png" , 
									"Sandalias diseñadas para excesiva comodidad" , 
									1 , "Negro" , "Femenino" , "Shoes" , "Calzado especializado" , 
									"Cuero");
	
	
		assertEquals("Sandalias", shoesTest.getName());
		assertEquals("6546454", shoesTest.getCode());
		assertEquals("Snick", shoesTest.getBrand());
		assertEquals(60000, shoesTest.getPrice());
		assertEquals("42", shoesTest.getSize());
		assertEquals("images/ClothesImage/rider.png", shoesTest.getPhoto());
		assertEquals("Sandalias diseñadas para excesiva comodidad", shoesTest.getDescription());
		assertEquals(1, shoesTest.getQuantity());
		assertEquals("Negro", shoesTest.getColor());
		assertEquals("Femenino", shoesTest.getGender());
		assertEquals("Shoes", shoesTest.getType());
		assertEquals("Calzado especializado", shoesTest.getTypeShoes());
		assertEquals("Cuero", shoesTest.getMaterial());
		assertNull(shoesTest.getRight());
		assertNull(shoesTest.getLeft());
	}
	
	public void testGettersAndSetters() {
		setupStage1();
		Shoes shoesTest = new Shoes( " " , " " , " " , 0 , " " , " " , " " , 0, " " , " " , " " , " " , " " );
		
		shoesTest.setName("Sandalias");
		shoesTest.setCode("6546454");
		shoesTest.setBrand("Snick");
		shoesTest.setPrice(60000);
		shoesTest.setSize("42");
		shoesTest.setPhoto("images/ClothesImage/rider.png");
		shoesTest.setDescription("Sandalias diseñadas para excesiva comodidad");
		shoesTest.setQuantity(1);
		shoesTest.setCode("Negro");
		shoesTest.setGender("Femenino");
		shoesTest.setType("Shoes");
		shoesTest.setMaterial("Cuero");
		shoesTest.setRight(null);
		shoesTest.setLeft(null);
		
		assertEquals("Sandalias", shoesTest.getName());
		assertEquals("6546454", shoesTest.getCode());
		assertEquals("Snick", shoesTest.getBrand());
		assertEquals(60000, shoesTest.getPrice());
		assertEquals("42", shoesTest.getSize());
		assertEquals("images/ClothesImage/rider.png", shoesTest.getPhoto());
		assertEquals("Sandalias diseñadas para excesiva comodidad", shoesTest.getDescription());
		assertEquals(1, shoesTest.getQuantity());
		assertEquals("Negro", shoesTest.getColor());
		assertEquals("Femenino", shoesTest.getGender());
		assertEquals("Shoes", shoesTest.getType());
		assertEquals("Calzado especializado", shoesTest.getTypeShoes());
		assertEquals("Cuero", shoesTest.getMaterial());
		assertNull(shoesTest.getRight());
		assertNull(shoesTest.getLeft());
	}

}
