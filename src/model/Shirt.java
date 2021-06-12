
package model;

import java.io.Serializable;

public class Shirt extends Clothing implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String cloth;//tipo de tela
    private String typeShirt;//tipo de camisa

    
    public Shirt(String cloth, String typeShirth, String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type) {
        super(name, code, brand, price, size, photo, description, quantity, color, gender, type);
        this.cloth = cloth;
        this.typeShirt = typeShirth;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getTypeShirt() {
        return typeShirt;
    }

    public void setTypeShirt(String typeShirt) {
        this.typeShirt = typeShirt;
    }
    
    
}
