package model;

public class Glasses extends Accessories {

    private String color;
    private String size;
    private String description;//lente
    private String design;
    private Glasses next;
    private Glasses prev;
    private Glasses currentGlass;
    private Glasses parent;


    public Glasses(String color, String size, String description, String design, String name, String code, String brand, double price, String photo, String type) {
        super(name, code, brand, price, photo, type);
        this.color = color;
        this.size = size;
        this.description = description;
        this.design = design;
        parent = null;
    }

    public void addGlasses(Glasses glassesToAdd) {
    	if(currentGlass==null) {
    		currentGlass = glassesToAdd;
    	}else {
    		addGlasses(currentGlass.getNext(),glassesToAdd,currentGlass);
    	}
    }

    private void addGlasses(Glasses current, Glasses glassesToAdd, Glasses prevGlasses) {
    	if(current==null) {
    		current = glassesToAdd;
    		current.setPrev(prevGlasses);
    		prevGlasses.setNext(current);
    	}else {
    		addGlasses(current.getNext(),glassesToAdd,current);
    	}
    }
    
    public void deleteAGlass(Glasses glassesToDelete) {
    	Glasses youNeedToGetOut;
    	if(currentGlass == glassesToDelete) {	
    		currentGlass = currentGlass.getNext();
    		if(currentGlass!=null) {
    			youNeedToGetOut = glassesToDelete;
    			youNeedToGetOut.setNext(null);
    		}
    	}else if (currentGlass!=null) {
    		deleteAGlass(currentGlass.getNext(),glassesToDelete);
    	}
    }
	
    private void deleteAGlass(Glasses actual, Glasses glassesToDelete) {
    	if(actual == glassesToDelete) {
    		Glasses tempGlassToRemove = actual;
    		Glasses newNextGlass = actual.getNext();
    		Glasses newPrevGlass = actual.getPrev();
    		newPrevGlass.setNext(actual.getNext());
    		if(newNextGlass!=null) {
    			newNextGlass.setPrev(actual.getPrev());
    		}
    		tempGlassToRemove.setPrev(null);
    		tempGlassToRemove.setNext(null);
    	}
    	else {
    		deleteAGlass(actual.getNext(),glassesToDelete);
    	}	
    }


	public Glasses getCurrentGlass() {
		return currentGlass;
	}

	public void setCurrentGlass(Glasses currentGlass) {
		this.currentGlass = currentGlass;
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
