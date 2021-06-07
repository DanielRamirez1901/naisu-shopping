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
		marketTest.addBuyer(new Buyer("Janna" , "Flitz" , "999" , "Janna999@gmail.com" ,
									  "ara123" , "Jvna" , "images/UserImage/Janna.png"));
	}
	
	@Test
	void testAddSeller() {
		Market marketTest = setupStage2();
		marketTest.addSeller(new Seller( "Levi" , "Ackerman" , "9549" , "Ackerman@gmail.com" ,
										 "5654" , "Levi" , "images/UserImage/Levi.png" ));
	}
	
	public Market setupStage3() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testDeleteBuyer() {
		Market marketTest = setupStage3();
		marketTest.deleteBuyer("Janna");
	}
	
	@Test
	void testDeleteSeller() {
		Market marketTest = setupStage3();
		marketTest.deleteSeller(new Seller( "Levi" , "Ackerman" , "9549" , "Ackerman@gmail.com" ,
										 "5654" , "Levi" , "images/UserImage/Levi.png" ));
	}
		
	public Market setupStage4() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testAddCloting() {
		Market marketTest = setupStage4();
		marketTest.addClothing(new Clothing( "Camisa" , "654654" , "Snick" , 50000, 
											 "L" , "images/ClothesImages/Shirt.png", 
											 "Camisa unisex, grande y comoda" , 2 , 
											 "Rojo" , "Unisex" , "Shirts" ));
	}
	
	@Test
	void testAddAccessories() {
		Market marketTest = setupStage4();
		marketTest.addAccesssories(new Accessories( "Gafas de sol" , "45887" , "glass" , 2260000 ,
													"images/AccessoriesImages/glasses.png", "glasses" ));
	}
	
	public Market setupStage5() {
		Market marketTest = new Market();
		return marketTest;
	}
	
	@Test
	void testDeleteClothing() {
		Market marketTest = setupStage5();
		marketTest.deleteClothing(new Clothing( "Camisa" , "654654" , "Snick" , 50000, 
											 "L" , "images/ClothesImages/Shirt.png", 
											 "Camisa unisex, grande y comoda" , 2 , 
											 "Rojo" , "Unisex" , "Shirts" ));
	}
	
	@Test
	void testDeleteAccessories() {
		Market marketTest = setupStage5();
		marketTest.deleteAccessories(new Accessories( "Gafas de sol" , "45887" , "glass" , 2260000 ,
													"images/AccessoriesImages/glasses.png", "glasses" ));
	}

	
}
