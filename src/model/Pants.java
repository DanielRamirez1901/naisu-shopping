
package model;

public class Pants extends Clothing{
    private String tipePant;//tipo de pantalon
    private String material;//material de fabricacion

    public Pants(String tipePant, String material, String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type) {
        super(name, code, brand, price, size, photo, description, quantity, color, gender, type);
        this.tipePant = tipePant;
        this.material = material;
    }

    public String getTipePant() {
        return tipePant;
    }

    public void setTipePant(String tipePant) {
        this.tipePant = tipePant;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
