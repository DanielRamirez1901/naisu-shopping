package model;

import java.util.ArrayList;

public class Buyer extends User {

    private ArrayList <Accessories> historyAccessories;
    private ArrayList <Accessories> shoppingCartAccessories;
    private Clothing historyClothing;
    private Clothing shoppingCartClothing;
    private Market market;

    public Buyer(String name, String lastName, String id, String email, String password, String nameUser, String picture) {
        super(name, lastName, id, email, password, nameUser, picture);
        historyAccessories = new ArrayList<Accessories>();
        shoppingCartAccessories = new ArrayList<Accessories>();
        this.historyClothing = null;
        this.shoppingCartClothing = null;
    }
    
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
 
    public void addThatBuyToHistoryAccessories(Accessories accesoryBuyed) {
    	historyAccessories.add(accesoryBuyed);
    }
    
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

	public Clothing getHistoryClothing() {
        return historyClothing;
    }

    public void setHistoryClothing(Clothing historyClothing) {
        this.historyClothing = historyClothing;
    }

    public Clothing getShoppingCartClothing() {
        return shoppingCartClothing;
    }

    public void setShoppingCartClothing(Clothing shoppingCartClothing) {
        this.shoppingCartClothing = shoppingCartClothing;
    }



}
