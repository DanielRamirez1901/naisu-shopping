package model;

public class Accessories {
    private String name;//nombre
    private String code;//codigo
    private String brand;//marca
    private double price;//precio
    private String photo;//foto
    private String type;//tipo

    public Accessories(String name, String code, String brand, double price, String photo, String type) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.photo = photo;
        this.type = type;
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
