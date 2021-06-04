
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
    
    //Ordenamientos burbuja*************************************************
    //Ordenamiento por nombre de persona
    public void bubbleSortByName() {
    	User userToOrder;
    	for(int i = 0; i<(user.size()-1);i++) {
    		for(int j = 0; j<(user.size()-1);j++) {
    			if(user.get(j).getName().charAt(0)>user.get(j+1).getName().charAt(0)) {
    				userToOrder = user.get(j);
    				user.set(j, user.get(j+1));
    				user.set(j+1, userToOrder);
    			}
    		}
    	}
    }
    //Ordenamiento por apellido de la persona
    public void bubbleSortByLastname() {
    	User userToOrder;
    	for(int i = 0; i<(user.size()-1);i++) {
    		for(int j = 0; j<(user.size()-1);j++) {
    			if(user.get(j).getLastName().charAt(0)>user.get(j+1).getLastName().charAt(0)) {
    				userToOrder = user.get(j);
    				user.set(j, user.get(j+1));
    				user.set(j+1, userToOrder);
    			}
    		}
    	}
    }
  //**********************************************************************
    
  //Ordenamiento por seleccion
  //Ordenamiento por user name
    public void selectionSortByUserName() {
    	User aux;
    	int posMin;
    	for(int i = 0; i<user.size();i++) {
    		posMin = i;
    		for(int j = i;j<user.size();j++) {
    			if(user.get(j).getNameUser().charAt(0)<user.get(posMin).getNameUser().charAt(0)) {
    				posMin = j;
    			}
    		}
    		aux = user.get(i);
    		user.set(i, user.get(posMin));
    		user.set(posMin, aux);
    	}
    }
    //Ordenamiento por ID
    public void selectionSortByUserID() {
    	User aux;
    	int posMin;
    	for(int i = 0; i<user.size();i++) {
    		posMin = i;
    		for(int j = i;j<user.size();j++) {
    			if(user.get(j).getId().charAt(0)<user.get(posMin).getId().charAt(0)) {
    				posMin = j;
    			}
    		}
    		aux = user.get(i);
    		user.set(i, user.get(posMin));
    		user.set(posMin, aux);
    	}
    }
    
    
}
