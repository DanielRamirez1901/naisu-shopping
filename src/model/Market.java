
package model;

import java.util.ArrayList;


public class Market {
    private ArrayList<User> user;

    public Market() {
        user = new ArrayList<User>();
    }
    
    public void addBuyer(Buyer buyer){
        user.add(buyer);
    }
    
    public void deleteBuyer(Buyer buyer) {
    	
    }
    
    public void searchBuyer(Buyer buyer) {
    	
    }
    
    public void addSeller(Seller seller){
        user.add(seller);
    }
    
    public void deleteSeller(Seller seller) {
    	
    }
    
    public void searchSeller(Seller seller) {
    	
    }
    
    
}
