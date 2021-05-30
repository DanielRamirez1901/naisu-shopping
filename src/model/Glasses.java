
package model;

public class Glasses extends Accessories{
    private String color;
    private String size;
    private double description;//lente
    private String design;

    public Glasses(String color, String size, double description, String design, String name, String code, String brand, double price, String photo, String type) {
        super(name, code, brand, price, photo, type);
        this.color = color;
        this.size = size;
        this.description = description;
        this.design = design;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }



}
