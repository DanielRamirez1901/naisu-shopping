
package model;

public class Shoes extends Clothing{
    private String typeShoes;//tipo de calzado
    private String material;//material de fabricacion
    private String decription;//descripcion
    private Shoes parent;
    private Shoes left;
    private Shoes right;

    public Shoes(String typeShoes, String material, String decription, String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type) {
        super(name, code, brand, price, size, photo, description, quantity, color, gender, type);
        this.typeShoes = typeShoes;
        this.material = material;
        this.decription = decription;
        left = null;
        right = null;
        parent = null;
        
    }

    public Shoes getParent() {
        return parent;
    }

    public void setParent(Shoes parent) {
        this.parent = parent;
    }

    public Shoes getLeft() {
        return left;
    }

    public void setLeft(Shoes left) {
        this.left = left;
    }

    public Shoes getRight() {
        return right;
    }

    public void setRight(Shoes right) {
        this.right = right;
    }

    public String getTypeShoes() {
        return typeShoes;
    }

    public void setTypeShoes(String typeShoes) {
        this.typeShoes = typeShoes;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
    
}
