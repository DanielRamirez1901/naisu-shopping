
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Market {
    private ArrayList<User> user;
    private Glasses currentGlass;
    private ArrayList<Jewelry>jewelry;
    private ArrayList<Glasses>glasses;
    private Jewelry rootJ;
    private Jewelry jw;
    private Glasses rootG;
    private Glasses gl;

    public Market() {
        user = new ArrayList<User>();
        jewelry = new ArrayList<>();
        glasses = new ArrayList<>();
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
    
   //*********************************************************************
    
    //Ordenamiento por insercion
    //Ordenando usuario por email
    public void insertionSortByUserEmail() {
    	User temporal;
    	for(int i = 1; i<user.size();i++) {
    		for(int j = 1;j>0 && user.get(j-1).getEmail().charAt(0)>user.get(j).getEmail().charAt(0);j--) {
    			temporal = user.get(j);
    			user.set(j, user.get(j-1));
    			user.set((j-1), temporal);
    		}
    	}
    }
    
    //Ordenamiento usuario por nombre
    public void insertionSortByName() {
    	User temporal;
    	for(int i = 1; i<user.size();i++) {
    		for(int j = 1;j>0 && user.get(j-1).getName().charAt(0)>user.get(j).getName().charAt(0);j--) {
    			temporal = user.get(j);
    			user.set(j, user.get(j-1));
    			user.set((j-1), temporal);
    		}
    	}
    } 
    //Busqueda binaria por nombre de vendedor
    public int binarySearchBySellerName(ArrayList<Seller> sellerX, String name) {
        String nameSeller = name.toLowerCase();
        int pos = -1;
        int i = 0;
        int j = sellerX.size() - 1;
        while (i <= j && pos < 0) {
            int m = (i + j) / 2;
            if (sellerX.get(m).getName().equals(nameSeller)) {
                pos = m;
            } else if (nameSeller.compareTo(sellerX.get(m).getName()) > 0) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }//End while
        return pos;
    }//End binarySearch method
    
    //Busqueda binaria por apellido de comprador
    public int binarySearchByBuyerLastname(ArrayList<Buyer> buyerX, String name) {
        String buyerName = name.toLowerCase();
        int pos = -1;
        int i = 0;
        int j = buyerX.size() - 1;

        while (i <= j && pos < 0) {
            int m = (i + j) / 2;
            if (buyerX.get(m).getName().equals(buyerName)) {
                pos = m;
            } else if (buyerName.compareTo(buyerX.get(m).getName()) > 0) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }//End while
        return pos;
    }//End binarySearch method
    
    //Listas doblemente enlazadas utilizando recursividad
    //Añadir
    public void addGlasses(Glasses glassesToAdd) {
    	if(currentGlass==null) {
    		currentGlass = glassesToAdd;
    	}else {
    		addGlasses(currentGlass.getNext(),glassesToAdd,currentGlass);
    	}
    }
    
    private void addGlasses(Glasses current, Glasses glassesToAdd, Glasses prevGlasses) {
		if(current==null) {
			current = glassesToAdd;
			current.setPrev(prevGlasses);
			prevGlasses.setNext(current);
		}else {
			addGlasses(current.getNext(),glassesToAdd,current);
		}
	}
    //Eliminar
    public void deleteAGlass(Glasses glassesToDelete) {
    	Glasses youNeedToGetOut;
    	if(currentGlass == glassesToDelete) {	
    		currentGlass = currentGlass.getNext();
    		if(currentGlass!=null) {
    			youNeedToGetOut = glassesToDelete;
    			youNeedToGetOut.setNext(null);
    		}
    	}else if (currentGlass!=null) {
    		deleteAGlass(currentGlass.getNext(),glassesToDelete);
    	}
    }
	
    private void deleteAGlass(Glasses actual, Glasses glassesToDelete) {
    	if(actual == glassesToDelete) {
    		Glasses tempGlassToRemove = actual;
    		Glasses newNextGlass = actual.getNext();
    		Glasses newPrevGlass = actual.getPrev();
    		newPrevGlass.setNext(actual.getNext());
    		if(newNextGlass!=null) {
    			newNextGlass.setPrev(actual.getPrev());
    		}
    		tempGlassToRemove.setPrev(null);
    		tempGlassToRemove.setNext(null);
    	}
    	else {
    		deleteAGlass(actual.getNext(),glassesToDelete);
    	}	
    }
    
    
    //pre: Esta objeto debe haber sido creado anteriormente
    //Algoritmo arbol de busqueda binaria insertando con el precio
    public void inssertJewelryByPrice(double priceJewelry) {
    	Jewelry jewelryToAdd = new Jewelry(jw.getMateial(), jw.getGender() , jw.getName(), jw.getCode(), jw.getBrand(), priceJewelry, jw.getPhoto(), jw.getType());
    		if(rootJ == null) {
    			rootJ = jewelryToAdd;
    		}else {
    			inssertJewelryByPrice(rootJ,jewelryToAdd);
    		}
    }
    
    private void inssertJewelryByPrice(Jewelry currentJewelry, Jewelry jewelryToAdd) {
    	if(currentJewelry.getPrice()<jewelryToAdd.getPrice()) {
    		if(currentJewelry.getRight()==null) {
    			currentJewelry.setRight(jewelryToAdd);
			}else {
				inssertJewelryByPrice(currentJewelry.getRight(),jewelryToAdd);
			}
		}if(currentJewelry.getPrice()>jewelryToAdd.getPrice()) {
			if(currentJewelry.getLeft()==null) {
				currentJewelry.setLeft(jewelryToAdd);
			}else {
				inssertJewelryByPrice(currentJewelry.getLeft(),jewelryToAdd);
			}
		}
	}

//  pre: Esta objeto debe haber sido creado anteriormente
//  Algoritmo arbol de busqueda binaria insertando con el precio
    public void inssertGlassesByPrice(double glassesPrice) {
    	Glasses glassesToAdd = new Glasses(gl.getName(), gl.getCode(), gl.getBrand(), glassesPrice, gl.getPhoto(), gl.getType(), gl.getColor(), gl.getSize(),gl.getDescription(), gl.getDesign());
    		if(rootG == null) {
    			rootG = glassesToAdd;
    		}else {
    			inssertGlassesByPrice(rootG , glassesToAdd);
    		}
    }
   
	private void inssertGlassesByPrice(Glasses currentGlasses, Glasses glassesToAdd) {
		if(currentGlasses.getPrice()<glassesToAdd.getPrice()) {
			if(currentGlasses.getRight()==null) {
				currentGlasses.setRight(glassesToAdd);
			}else {
				inssertGlassesByPrice(currentGlasses.getRight(), glassesToAdd);
			}
		}if(currentGlasses.getPrice()>glassesToAdd.getPrice()) {
			if(currentGlasses.getLeft()==null) {
				currentGlasses.setLeft(glassesToAdd);
			}else {
				inssertGlassesByPrice(currentGlasses.getLeft(),glassesToAdd);
			}
		}
	}  
	  //Algoritmos de ordenamientos implementados por java utilizando comparable y clase comparator

		//Por codigo de joya
		public void sortByJewelryCode() {
			Comparator<Jewelry> accessoriesCodeComparator = new AccessoriesCodeComparator();
			Collections.sort(jewelry,accessoriesCodeComparator);
		}
		
		//Algoritos de ordenamiento implementatos por java utilizando comparable, comparator y clase anonima
		
		public void sortByGlassesBrand() {
			Comparator<Glasses> brandComparator = new Comparator<Glasses>()	{

				@Override
				public int compare(Glasses g1, Glasses g2) {
					return g1.getBrand().compareTo(g2.getBrand());
				}	
			};
			Collections.sort(glasses,brandComparator);
		}
		
		public void sortByGlassesPrice() {
			Comparator<Glasses> priceComparator = new Comparator<Glasses>() {

				@Override
				public int compare(Glasses g1, Glasses g2) {
					return Double.compare(g1.getPrice(), g2.getPrice());
				}
				
			};
			Collections.sort(glasses,Collections.reverseOrder(priceComparator));
		}
		
		public ArrayList<User> getUser() {
			return user;
		}

		public void setUser(ArrayList<User> user) {
			this.user = user;
		}

		public Glasses getCurrentGlass() {
			return currentGlass;
		}

		public void setCurrentGlass(Glasses currentGlass) {
			this.currentGlass = currentGlass;
		}

		public ArrayList<Jewelry> getJewelry() {
			return jewelry;
		}

		public void setJewelry(ArrayList<Jewelry> jewelry) {
			this.jewelry = jewelry;
		}

		public ArrayList<Glasses> getGlasses() {
			return glasses;
		}

		public void setGlasses(ArrayList<Glasses> glasses) {
			this.glasses = glasses;
		}

		public Jewelry getRootJ() {
			return rootJ;
		}

		public void setRootJ(Jewelry rootJ) {
			this.rootJ = rootJ;
		}

		public Jewelry getJw() {
			return jw;
		}

		public void setJw(Jewelry jw) {
			this.jw = jw;
		}

		public Glasses getRootG() {
			return rootG;
		}

		public void setRootG(Glasses rootG) {
			this.rootG = rootG;
		}

		public Glasses getGl() {
			return gl;
		}

		public void setGl(Glasses gl) {
			this.gl = gl;
		}
		
		
}

