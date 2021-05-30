
package model;

public class Jewelry extends Accessories{
    private String mateial;
    private String gender;

    public Jewelry(String mateial, String gender, String name, String code, String brand, double price, String photo, String type) {
        super(name, code, brand, price, photo, type);
        this.mateial = mateial;
        this.gender = gender;
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
