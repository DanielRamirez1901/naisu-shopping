package model;


public class Accessories {
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
    public Accessories(String name, String code, String brand, double price, String photo, String type) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.photo = photo;
        this.type = type;
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

  //pre: Esta objeto debe haber sido creado anteriormente
  //Algoritmo arbol de busqueda binaria insertando con el precio
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
    
    
    
}
