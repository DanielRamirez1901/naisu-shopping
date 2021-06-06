package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Accessories implements Comparable<Jewelry>{
    private String name;//nombre
    private String code;//codigo
    private String brand;//marca
    private double price;//precio
    private String photo;//foto
    private String type;//tipo
    private Jewelry rootJ;
    private Jewelry jw;
    private Glasses rootG;
    private Glasses gl;
    private ArrayList<Jewelry>jewelry;
    private ArrayList<Glasses>glasses;
    public Accessories(String name, String code, String brand, double price, String photo, String type) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.photo = photo;
        this.type = type;
        jewelry = new ArrayList<>();
        glasses = new ArrayList<>();
    }

    //pre: Esta objeto debe haber sido creado anteriormente
    //Algoritmo arbol de busqueda binaria insertando con el precio
    public void inssertJewelryByPrice(double priceJewelry) {
    	Jewelry jewelryToAdd = new Jewelry(jw.getMateial(), jw.getGender() , name, code, brand, priceJewelry, photo, type);
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
    	Glasses glassesToAdd = new Glasses(gl.getColor(), gl.getSize(),gl.getDescription(), gl.getDesign(), name, code, brand, glassesPrice, photo, type);
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
    
	public Jewelry getRoot() {
		return rootJ;
	}

	public void setRoot(Jewelry root) {
		this.rootJ = root;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
    	this.type = type;
    }
    
    
  //Algoritmos de ordenamientos implementados por java utilizando comparable y clase comparator
    //Por nombre de accesorio
    public void sortByJewelryName() {
    	Collections.sort(jewelry);
    }
	@Override
	public int compareTo(Jewelry o) {
		return name.compareTo(o.getName());
	}  
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
}
