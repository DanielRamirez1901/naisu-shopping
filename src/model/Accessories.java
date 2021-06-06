package model;

import java.util.ArrayList;
import java.util.Collections;


public class Accessories implements Comparable<Jewelry>{
    private String name;//nombre
    private String code;//codigo
    private String brand;//marca
    private double price;//precio
    private String photo;//foto
    private String type;//tipo
    private ArrayList<Jewelry>jewelry;


    public Accessories(String name, String code, String brand, double price, String photo, String type) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.photo = photo;
        this.type = type;
        jewelry = new ArrayList<>();
    }

    //Por nombre de accesorio
    public void sortByJewelryName() {
    	Collections.sort(jewelry);
    }
	@Override
	public int compareTo(Jewelry o) {
		return name.compareTo(o.getName());
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
