package model;

import java.io.Serializable;

class Clothing implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;//nombre
    private String code;//codigo
    private String brand;//marca
    private double price;//precio
    private String size;//talla
    private String photo;//foto
    private String description;//descripción
    private int quantity;//cantidad
    private String color;//color
    private String gender;//genero
    private String type;//tipo
    
    

    public Clothing(String name, String code, String brand, double price, String size, String photo, String description, int quantity, String color, String gender, String type) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.photo = photo;
        this.description = description;
        this.quantity = quantity;
        this.color = color;
        this.gender = gender;
        this.type = type;	
    }

    public void lessQuantity() {
    	quantity--;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
}
