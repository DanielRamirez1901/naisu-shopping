package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarketTest {

	
	public void setupStage1() {
		
	}
	
	@Test
	void testMarket() {
		setupStage1();
		Market marketTest = new Market();
		assertNotNull(marketTest.getUser());
		assertTrue(marketTest.getUser().isEmpty());
		assertNotNull(marketTest.getJewelry());
		assertTrue(marketTest.getJewelry().isEmpty());
		assertNotNull(marketTest.getGlasses());
		assertTrue(marketTest.getGlasses().isEmpty());
		assertNotNull(marketTest.getAcc());
		assertTrue(marketTest.getAcc().isEmpty());
		assertNotNull(marketTest.getClothing());
		assertTrue(marketTest.getClothing().isEmpty());
		assertNotNull(marketTest.getBuyer());
		assertTrue(marketTest.getBuyer().isEmpty());
		assertNotNull(marketTest.getSeller());
		assertTrue(marketTest.getSeller().isEmpty());
	}
	
	
	
	public Market setupStage2() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testAddBuyer() {
		Market marketTest = setupStage2();
		marketTest.addBuyer("Janna" , "Flitz" , "999" , "Janna999@gmail.com" ,
									  "ara123" , "Jvna" , "images/UserImage/Janna.png");
	}
	
	@Test
	void testAddSeller() {
		Market marketTest = setupStage2();
		marketTest.addSeller("Levi" , "Ackerman" , "9549" , "Ackerman@gmail.com" ,
										 "5654" , "Levi" , "images/UserImage/Levi.png" );
	}
	
	public Market setupStage3() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testDeleteUser() {
		Market marketTest = setupStage3();
		marketTest.deleteUser("Levi");
	}

		
	public Market setupStage4() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testAddClothingShirt() {
		Market marketTest = setupStage4();
		marketTest.addClothingShirt( "Suave" , "Para reuniones formales" , "Camisa" ,
								     "654654" , "Snick" , 50000 , "L" , "images/ClothesImages/Shirt.png",
								     "Camisa unisex, grande y comoda", 2 , "Rojo" , "Unisex" , "Shirts" );
	}
	
	@Test
	void testAddClothingPants() {
		Market marketTest = setupStage4();
		marketTest.addClothingPants("Jeans" , "46454" , "BlackJeans" , 110000 , 
				"M" , "images/ClothesImages/jean.png" , 
				"Pantalones diseñados para personas delgadas" , 
				1 , "Negro" , "Femenino" , "Pants" , "Para reuniones" , 
				"Cuero");
	}
	
	@Test
	void testAddClothingShoes() {
		Market marketTest = setupStage4();
		marketTest.addClothingShoes("Sandalias" , "6546454" , "Snick" , 60000 , 
									"42" , "images/ClothesImage/rider.png" , 
									"Sandalias diseñadas para excesiva comodidad" , 
									1 , "Negro" , "Femenino" , "Shoes" , "Calzado especializado" , 
									"Cuero");
	}
	
	@Test
	void testAddAccessoriesGlasses() {
		Market marketTest = setupStage4();
		marketTest.addAccessoriesGlasses("Gafas de sol" , "45887" , "glass" , 2260000 ,
											"images/AccessoriesImages/glass.png" , "glasses" ,
											"Rojo" , "3 cm" , "Lente de tamaño normal diseñado"
											+ " para gente con problemas visuales" , 
											"Diseño economico");
	}
	
	@Test
	void testAddAccessoriesJewelry() {
		Market marketTest = setupStage4();
		marketTest.addAccesssoriesJewels("Collar" , "4555887" , "sDiamond" , 10260000 , 
										   "images/AccessoriesImages/diamond.jpg" , 
										   "jewels" , "Diamante" , "Unisex");
	}
	
	
	public Market setupStage5() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testDeleteClothing() {
		Market marketTest = setupStage5();
		marketTest.deleteClothing( "Camisa" );
	}
	
	@Test
	void testDeleteAccessories() {
		Market marketTest = setupStage5();
		marketTest.deleteAccessories("Gafas de sol");
	}

	
}
