
package model;

public class Jewelry extends Accessories{
    private String material;
    private String gender;
    private Jewelry left;
    private Jewelry right;



    public Jewelry(String name, String code, String brand, double price, String photo, String type, String material, String gender) {
        super(name, code, brand, price, photo, type);
        this.material = material;
        this.gender = gender;
        left = null;
        right = null;      
    }


	public Jewelry getRight() {
		return right;
	}


	public void setRight(Jewelry right) {
		this.right = right;
	}


	public Jewelry getLeft() {
		return left;
	}


	public void setLeft(Jewelry left) {
		this.left = left;
	}


	public String getMaterial() {
		return material;
	}

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
