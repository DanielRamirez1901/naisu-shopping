
package model;

public class Pants extends Clothing{
    private String tipePant;//tipo de pantalon
    private String material;//material de fabricacion
    private Pants left;
    private Pants right;

    public Pants(String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type,String tipePant, String material) {
        super(name, code, brand, price, size, photo, description, quantity, color, gender, type);
        this.tipePant = tipePant;
        this.material = material;
        left = null;
        right = null;
    }

    public Pants getLeft() {
        return left;
    }

    public void setLeft(Pants left) {
        this.left = left;
    }

    public Pants getRight() {
        return right;
    }

    public void setRight(Pants right) {
        this.right = right;
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
