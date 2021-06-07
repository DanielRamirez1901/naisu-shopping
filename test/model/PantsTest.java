package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PantsTest {
	
	public void setupStage1() {
		
	}
	
	@Test
	public void testPants() {
		setupStage1();
		Pants pantsTest = new Pants( "Jeans" , "46454" , "BlackJeans" , 110000 , 
									"M" , "images/ClothesImages/jean.png" , 
									"Pantalones diseñados para personas delgadas" , 
									1 , "Negro" , "Femenino" , "Pants" , "Para reuniones" , 
									"Cuero");
		
		assertEquals("Jeans", pantsTest.getName());
		assertEquals("46454" , pantsTest.getCode());
		assertEquals("BlackJeans", pantsTest.getBrand());
		assertEquals(110000, pantsTest.getPrice());
		assertEquals("M", pantsTest.getSize());
		assertEquals("images/ClothesImages/jean.png", pantsTest.getPhoto());
		assertEquals("Pantalones diseñados para personas delgadas", pantsTest.getDescription());
		assertEquals(1, pantsTest.getQuantity());
		assertEquals("Negro", pantsTest.getColor());
		assertEquals("Femenino", pantsTest.getGender());
		assertEquals("Pants", pantsTest.getType());
		assertEquals("Para reuniones", pantsTest.getTipePant());
		assertEquals("Cuero", pantsTest.getMaterial());
		assertNull(pantsTest.getRight());
		assertNull(pantsTest.getLeft());
	}
	
	@Test
	public void testSettersAndGetters() {
		setupStage1();
		Pants pantsTest = new Pants( " " , " " , " " , 0 , " " , " " , " " , 0 , " " , " " , " " , " " , " ");
		
		pantsTest.setName("Jeans");
		pantsTest.setCode("46454");
		pantsTest.setBrand("BlackJeans");
		pantsTest.setPrice(110000);
		pantsTest.setSize("M");
		pantsTest.setPhoto("images/ClothesImages/jean.png");
		pantsTest.setDescription("Pantalones diseñados para personas delgadas");
		pantsTest.setQuantity(1);
		pantsTest.setColor("Negro");
		pantsTest.setGender("Femenino");
		pantsTest.setType("Pants");
		pantsTest.setTipePant("Para reuniones");
		pantsTest.setMaterial("Cuero");
		pantsTest.setRight(null);
		pantsTest.setLeft(null);
		
		
		assertEquals("Jeans", pantsTest.getName());
		assertEquals("46454" , pantsTest.getCode());
		assertEquals("BlackJeans", pantsTest.getBrand());
		assertEquals(110000, pantsTest.getPrice());
		assertEquals("M", pantsTest.getSize());
		assertEquals("images/ClothesImages/jean.png", pantsTest.getPhoto());
		assertEquals("Pantalones diseñados para personas delgadas", pantsTest.getDescription());
		assertEquals(1, pantsTest.getQuantity());
		assertEquals("Negro", pantsTest.getColor());
		assertEquals("Femenino", pantsTest.getGender());
		assertEquals("Pants", pantsTest.getType());
		assertEquals("Para reuniones", pantsTest.getTipePant());
		assertEquals("Cuero", pantsTest.getMaterial());
		assertNull(pantsTest.getRight());
		assertNull(pantsTest.getLeft());
	}

}
