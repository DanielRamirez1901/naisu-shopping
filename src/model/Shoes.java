
package model;

import java.io.Serializable;

public class Shoes extends Clothing implements Serializable{
    private static final long serialVersionUID = 1L;
    private String typeShoes;//tipo de calzado
    private String material;//material de fabricacion
    private Shoes left;
    private Shoes right;

    public Shoes(String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type, String typeShoes, String material) {
        super(name, code, brand, price, size, photo, description, quantity, color, gender, type);
        this.typeShoes = typeShoes;
        this.material = material;
        left = null;
        right = null;    
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
}
