package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Buyer extends User implements Serializable{
    private static final long serialVersionUID = 1L;

    private ArrayList <Accessories> historyAccessories;
    private ArrayList <Accessories> shoppingCartAccessories;
    private ArrayList <Clothing> historyClothing;
    private ArrayList <Clothing> shoppingCartClothing;

    public Buyer(String name, String lastName, String id, String email, String password, String nameUser, String picture) {
        super(name, lastName, id, email, password, nameUser, picture);
        historyAccessories = new ArrayList<Accessories>();
        shoppingCartAccessories = new ArrayList<Accessories>();
        historyClothing = new ArrayList<Clothing>();
        shoppingCartClothing = new ArrayList<Clothing>();
    }

//*************************************ADD TO SHOPPING CAR AND BUY:ACCESSORIES*********************************
    public void addAccessoryToShoppingCart(Accessories accessoryToAdd) {
    	shoppingCartAccessories.add(accessoryToAdd);
    }
    
    public Accessories searchAccessoryInCartAccessories(String name) {
        for (int i = 0; i < shoppingCartAccessories.size(); i++) {
            if (shoppingCartAccessories.get(i).getName().compareTo(name) == 0) {
                return shoppingCartAccessories.get(i);
            }//End if
        }//End for
        return null;
    }
    
    public boolean canYouBuyThatAccessory(String name) {
    	boolean youCanBuyThat = false;
    	if(searchAccessoryInCartAccessories(name)!=null) {
    		Accessories accessoryToBuy = searchAccessoryInCartAccessories(name);
    		historyAccessories.add(accessoryToBuy);
    		youCanBuyThat = true;
    		return youCanBuyThat;
    	}else {
    		return youCanBuyThat;
    	}
    }

//*********************************************ADD TO SHOPPING CAR AND BUY:CLOTHING*******************************
    public void addToClothingShoppingCar(Clothing clothingToAdd) {
    	shoppingCartClothing.add(clothingToAdd);
    }
    
    public Clothing searchClothingInClothingCart(String name) {
        for (int i = 0; i < shoppingCartClothing.size(); i++) {
            if (shoppingCartClothing.get(i).getName().compareTo(name) == 0) {
                return shoppingCartClothing.get(i);
            }//End if
        }//End for
        return null;
    }
    
    public boolean canYouBuyThatClothing(String name) {
    	boolean canYouBuyThat = false;
    	if(searchClothingInClothingCart(name)!=null) {
    		Clothing clothingToBuy = searchClothingInClothingCart(name);
    		if(clothingToBuy.getQuantity()>0) {
    			historyClothing.add(clothingToBuy);
    			clothingToBuy.lessQuantity();
    			canYouBuyThat = true;
    			return canYouBuyThat;
    		}
    		return canYouBuyThat;
    	}else {
    		return canYouBuyThat;
    	}
    }

//***********************************************************************************************
    
    public ArrayList<Accessories> getHistoryAccessories() {
		return historyAccessories;
	}

	public void setHistoryAccessories(ArrayList<Accessories> historyAccessories) {
		this.historyAccessories = historyAccessories;
	}

	public ArrayList<Accessories> getShoppingCartAccessories() {
		return shoppingCartAccessories;
	}

	public void setShoppingCartAccessories(ArrayList<Accessories> shoppingCartAccessories) {
		this.shoppingCartAccessories = shoppingCartAccessories;
	}

	public ArrayList<Clothing> getHistoryClothing() {
		return historyClothing;
	}

	public void setHistoryClothing(ArrayList<Clothing> historyClothing) {
		this.historyClothing = historyClothing;
	}

	public ArrayList<Clothing> getShoppingCartClothing() {
		return shoppingCartClothing;
	}

	public void setShoppingCartClothing(ArrayList<Clothing> shoppingCartClothing) {
		this.shoppingCartClothing = shoppingCartClothing;
	}

}
