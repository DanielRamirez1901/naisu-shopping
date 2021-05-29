
package model;

import java.util.ArrayList;


public class Market {
    private ArrayList<User> user;

    public Market() {
        user = new ArrayList<User>();
    }
    
    public void addBuyer( Buyer buyer){
        user.add(buyer);
    }
    
    
    
}
