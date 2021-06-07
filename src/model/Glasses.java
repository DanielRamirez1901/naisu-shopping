package model;

public class Glasses extends Accessories {

    private String color;
    private String size;
    private String description;//lente
    private String design;
    private Glasses next;
    private Glasses prev;
    private Glasses right;
    private Glasses left;
    private Glasses parent;


    public Glasses(String color, String size, String description, String design, String name, String code, String brand, double price, String photo, String type) {
        super(name, code, brand, price, photo, type);
        this.color = color;
        this.size = size;
        this.description = description;
        this.design = design;
        parent = null;
    }




	public Glasses getRight() {
		return right;
	}

	public void setRight(Glasses right) {
		this.right = right;
	}

	public Glasses getLeft() {
		return left;
	}

	public void setLeft(Glasses left) {
		this.left = left;
	}

	public Glasses getNext() {
		return next;
	}


	public void setNext(Glasses next) {
		this.next = next;
	}


	public Glasses getPrev() {
		return prev;
	}


	public void setPrev(Glasses prev) {
		this.prev = prev;
	}


	public Glasses getParent() {
        return parent;
    }

    public void setParent(Glasses parent) {
        this.parent = parent;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

}