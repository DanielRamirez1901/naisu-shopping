
package model;

import java.util.ArrayList;

public class Seller extends User{
    
    private Accessories saleHistory;
 
    private Clothing productsToSale;

    private ArrayList<Glasses>glass;
    private ArrayList<Jewelry>jewel;
//    private Jewelry jw;
    
    public Seller(String name, String lastName, String id, String email, String password, String nameUser,String picture) {
        super(name, lastName, id, email, password, nameUser, picture);
        saleHistory = null;
        productsToSale = null;
        glass = new ArrayList<Glasses>();
        jewel = new ArrayList<Jewelry>();
    }

    
    public void addjewel(Jewelry jewelryToAdd) {
    	jewel.add(jewelryToAdd);
    }
    
    public void addGlass(Glasses glassesToAdd) {
    	glass.add(glassesToAdd);
    }

    
    
    public ArrayList<Glasses> getGlass() {
		return glass;
	}


	public void setGlass(ArrayList<Glasses> glass) {
		this.glass = glass;
	}


	public ArrayList<Jewelry> getJewel() {
		return jewel;
	}


	public void setJewel(ArrayList<Jewelry> jewel) {
		this.jewel = jewel;
	}


	public Accessories getSaleHistory() {
        return saleHistory;
    }

    public void setSaleHistory(Accessories saleHistory) {
        this.saleHistory = saleHistory;
    }

    public Clothing getProductsToSale() {
        return productsToSale;
    }

    public void setProductsToSale(Clothing productsToSale) {
        this.productsToSale = productsToSale;
    }
    
    

}
