
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Market {
    private ArrayList<User> user;
    private Glasses currentGlass;
    private ArrayList<Jewelry>jewelry;
    private ArrayList<Glasses>glasses;
    private ArrayList<Accessories> acc;
    private ArrayList<Clothing> clothing;
    private ArrayList<Buyer> buyer;
    private ArrayList <Seller> seller;
    private Seller sellerToSave;
    private Buyer isBuyer;
    private Jewelry rootJ;
    private Jewelry jw;
    private Glasses rootG; 
    private Glasses gl;

    public Market() {
        user = new ArrayList<User>();
        jewelry = new ArrayList<Jewelry>();
        glasses = new ArrayList<Glasses>();
        acc = new ArrayList<Accessories>();
        clothing = new ArrayList<Clothing>();
        buyer = new ArrayList<Buyer>();
        seller = new ArrayList<Seller>();
    }
 
//**************************************BUYER & SELLER*************************************************
    public void addBuyer(String name, String lastname, String id, String email, String password, String nameUser, String picture){
        User buyerToAdd = (new Buyer(name, lastname, id, email, password, nameUser, picture));
        user.add(buyerToAdd);
    }
    
    public void addSeller(String name, String lastname, String id, String email, String password, String nameUser, String picture) {
    	User sellerToAdd = (new Seller(name, lastname, id, email, password, nameUser, picture));
    	user.add(sellerToAdd);
    }
    public void deleteUser(String name) {
        User userToDelete = searchUser(name);
        if (userToDelete != null) {
            user.remove(userToDelete);
        }//End if
    }
    
    public int searchUserInt(String name) {
        int position = 0;
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }
    
    public User searchUser(String name) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getName().compareTo(name) == 0) {
                return user.get(i);
            }//End if
        }//End for
        return null;
    } 
//*********************************************END BUYER & SELLER***************************************
     
 
//********************************************ACCESSORIES******************************************
    
    public void addAccesssoriesJewels(String name, String code, String brand, double price, String photo, String type, String material, String gender) {
    	Accessories jewelToAdd = (new Jewelry(name,code,brand,price,photo,type,material,gender));
    	acc.add(jewelToAdd);
    }
    
    public void addAccessoriesGlasses(String name, String code, String brand, double price, String photo, String type,String color, String size, String description, String design) {
    	Accessories glassesToAdd = (new Glasses(name,code,brand,price,photo,type,color,size,description,design));
    	acc.add(glassesToAdd);
    }
    
    public void deleteAccessories(String name) {
        Accessories accessoriesToDelete = searchAccessories(name);
        if (accessoriesToDelete != null) {
        	sellerToSave.addAccessoriesToSaleHistory(accessoriesToDelete);
            acc.remove(accessoriesToDelete);
        }//End if
    }
    
    public int searchAccessoriesInt(String name) {
        int position = 0;
        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }
    
    public Accessories searchAccessories(String name) {
        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i).getName().compareTo(name) == 0) {
                return acc.get(i);
            }//End if
        }//End for
        return null;
    }
    
//********************************************END ACCESSORIES******************************************   
  
//********************************************CLOTHING******************************************
    
    public void addClothingShoes(String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type, String typeShoes, String material) {
    	Clothing shoesToAdd = (new Shoes(name,code,brand,price,size,photo,description,quantity,color,gender,type,typeShoes,material));
    	clothing.add(shoesToAdd);
    }
    
    public void addClothingPants(String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type,String tipePant, String material) {
    	Clothing pantsToAdd = (new Pants(name,code,brand,price,size,photo,description,quantity,color,gender,type,tipePant,material));
    	clothing.add(pantsToAdd);
    }
    
    public void addClothingShirt(String cloth, String typeShirth, String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type) {
    	Clothing shirtToAdd = (new Shirt(cloth,typeShirth,name,code,brand,price,size,photo,description,quantity,color,gender,type));
    	clothing.add(shirtToAdd);
    }
    
    public void deleteClothing(String name) {
        Clothing clothingToDelete = searchClothing(name);
        if (clothingToDelete != null) {
            clothing.remove(clothingToDelete);
        }//End if
    }
    
    public int searchClothingInt(String name) {
        int position = 0;
        for (int i = 0; i < clothing.size(); i++) {
            if (clothing.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }
    
    public Clothing searchClothing(String name) {
        for (int i = 0; i < clothing.size(); i++) {
            if (clothing.get(i).getName().compareTo(name) == 0) {
                return clothing.get(i);
            }//End if
        }//End for
        return null;
    }
    
    public boolean userLogin(String name, String password) {
        return ((searchUser(name) != null) && (searchUser(name).getPassword().compareTo(password) == 0)) ? true : false;
    }
    
//*********************************************ShoppingCar Buyer Accessories************************************
    
    public boolean addThatAccessoryToTheShoppingCart(String name) {
    	boolean uCanAddThat = false;
    	if(searchAccessories(name)!=null) {
    		Accessories accessoryToAdd = searchAccessories(name);
    		isBuyer.addAccessoryToShoppingCart(accessoryToAdd);
    		uCanAddThat = true;
    		return uCanAddThat;
    	}else {
    		return uCanAddThat;	
    	}
    }
    
    public boolean addThatClothingToTheShoppingCart(String name) {
    	boolean uCanAddThat = false;
    	if(searchClothing(name)!=null) {
    		Clothing clothingToAdd = searchClothing(name);
    		isBuyer.addToClothingShoppingCar(clothingToAdd);
    		uCanAddThat = true;
    		return uCanAddThat;
    	}else {
    		return uCanAddThat;	
    	}
    }
    
    
//********************************************END CLOTHING****************************************** 
    
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
    	Jewelry jewelryToAdd = new Jewelry( jw.getName(), jw.getCode(), jw.getBrand(), priceJewelry, jw.getPhoto(), jw.getType(), jw.getMaterial(), jw.getGender());
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

		public ArrayList<Accessories> getAcc() {
			return acc;
		}

		public void setAcc(ArrayList<Accessories> acc) {
			this.acc = acc;
		}

		public ArrayList<Clothing> getClothing() {
			return clothing;
		}

		public void setClothing(ArrayList<Clothing> clothing) {
			this.clothing = clothing;
		}

		public ArrayList<Buyer> getBuyer() {
			return buyer;
		}

		public void setBuyer(ArrayList<Buyer> buyer) {
			this.buyer = buyer;
		}

		public ArrayList<Seller> getSeller() {
			return seller;
		}

		public void setSeller(ArrayList<Seller> seller) {
			this.seller = seller;
		}
		
		
}

