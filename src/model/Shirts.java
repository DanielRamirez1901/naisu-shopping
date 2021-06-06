
package model;

public class Shirts extends Clothing{
    
    private String cloth;//tipo de tela
    private String typeShirth;//tipo de camisa

    
    public Shirts(String cloth, String typeShirth, String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type) {
        super(name, code, brand, price, size, photo, description, quantity, color, gender, type);
        this.cloth = cloth;
        this.typeShirth = typeShirth;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getTypeShirth() {
        return typeShirth;
    }

    public void setTypeShirth(String typeShirth) {
        this.typeShirth = typeShirth;
    }
    
    
}
