
package model;

public class Jewelry extends Accessories{
    private String mateial;
    private String gender;
    private Jewelry left;
    private Jewelry right;
    private Jewelry parent;

    public Jewelry(String mateial, String gender, String name, String code, String brand, double price, String photo, String type) {
        super(name, code, brand, price, photo, type);
        this.mateial = mateial;
        this.gender = gender;
        left = null;
        right = null;
        parent = null;
        
    }

    public Jewelry getLeft() {
        return left;
    }

    public void setLeft(Jewelry left) {
        this.left = left;
    }

    public Jewelry getRight() {
        return right;
    }

    public void setRight(Jewelry right) {
        this.right = right;
    }

    public Jewelry getParent() {
        return parent;
    }

    public void setParent(Jewelry parent) {
        this.parent = parent;
    }

    public String getMateial() {
        return mateial;
    }

    public void setMateial(String mateial) {
        this.mateial = mateial;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
