package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GlassesTest {
	
	public void setupStage1() {
		
	}
	
	@Test
	public void testGlassesTest() {
		setupStage1();
		Glasses glassesTest = new Glasses( "Gafas de sol" , "45887" , "glass" , 2260000 ,
											"images/AccessoriesImages/glass.png" , "glasses" ,
											"Rojo" , "3 cm" , "Lente de tamaño normal diseñado"
											+ " para gente con problemas visuales" , 
											"Diseño economico");
		
		assertEquals("Gafas de sol", glassesTest.getName());
		assertEquals("45887" , glassesTest.getCode());
		assertEquals("glass", glassesTest.getBrand());
		assertEquals(2260000, glassesTest.getPrice());
		assertEquals("images/AccessoriesImages/glass.png", glassesTest.getPhoto());
		assertEquals("glasses", glassesTest.getType());
		assertEquals("Rojo", glassesTest.getColor());
		assertEquals("3 cm", glassesTest.getSize());
		assertEquals("Lente de tamaño normal diseñado para gente con problemas visuales", glassesTest.getDescription());
		assertEquals("Diseño economico", glassesTest.getDesign());
		assertNull(glassesTest.getNext());
		assertNull(glassesTest.getPrev());
		assertNull(glassesTest.getRight());
		assertNull(glassesTest.getLeft());
	}
	
	@Test
	public void testGettersAndSetters() {
		setupStage1();
		Glasses glassesTest = new Glasses( " " , " " , " " , 0 , " " , " " , " " , " " , " " , " " );

		glassesTest.setName("Gafas de sol");
		glassesTest.setCode("45887");
		glassesTest.setBrand("glass");
		glassesTest.setPrice(2260000);
		glassesTest.setPhoto("images/AccessoriesImages/glass.png");
		glassesTest.setType("glasses");
		glassesTest.setColor("Rojo");
		glassesTest.setSize("3 cm");
		glassesTest.setDescription("Lente de tamaño normal diseñado para gente con problemas visuales");
		glassesTest.setDesign("Diseño economico");
		glassesTest.setNext(null);
		glassesTest.setPrev(null);
		glassesTest.setRight(null);
		glassesTest.setLeft(null);
		
		assertEquals("Gafas de sol", glassesTest.getName());
		assertEquals("45887" , glassesTest.getCode());
		assertEquals("glass", glassesTest.getBrand());
		assertEquals(2260000, glassesTest.getPrice());
		assertEquals("images/AccessoriesImages/glass.png", glassesTest.getPhoto());
		assertEquals("glasses", glassesTest.getType());
		assertEquals("Rojo", glassesTest.getColor());
		assertEquals("3 cm", glassesTest.getSize());
		assertEquals("Lente de tamaño normal diseñado para gente con problemas visuales", glassesTest.getDescription());
		assertEquals("Diseño economico", glassesTest.getDesign());
		assertNull(glassesTest.getNext());
		assertNull(glassesTest.getPrev());
		assertNull(glassesTest.getRight());
		assertNull(glassesTest.getLeft());
	}

}
