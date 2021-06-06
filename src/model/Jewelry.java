
package model;

public class Jewelry extends Accessories{
    private String material;
    private String gender;
    private Jewelry left;
    private Jewelry right;
    private Jewelry parent;


    public Jewelry(String material, String gender, String name, String code, String brand, double price, String photo, String type) {
        super(name, code, brand, price, photo, type);
        this.material = material;
        this.gender = gender;
        left = null;
        right = null;
        parent = null;
        
    }

    
    public Jewelry getParent() {
		return parent;
	}


	public void setParent(Jewelry parent) {
		this.parent = parent;
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


	public String getMateial() {
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
