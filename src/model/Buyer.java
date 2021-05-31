package model;

public class Buyer extends User {

    private Accessories historyAccessories;
    private Accessories shoppingCartAccessories;
    private Clothing historyClothing;
    private Clothing shoppingCartClothing;

    public Buyer(String name, String lastName, String id, String email, String password, String nameUser, String picture) {
        super(name, lastName, id, email, password, nameUser, picture);
        this.historyAccessories = null;
        this.shoppingCartAccessories = null;
        this.historyClothing = null;
        this.shoppingCartClothing = null;
    }

    public Accessories getHistoryAccessories() {
        return historyAccessories;
    }

    public void setHistoryAccessories(Accessories historyAccessories) {
        this.historyAccessories = historyAccessories;
    }

    public Accessories getShoppingCartAccessories() {
        return shoppingCartAccessories;
    }

    public void setShoppingCartAccessories(Accessories shoppingCartAccessories) {
        this.shoppingCartAccessories = shoppingCartAccessories;
    }

    public Clothing getHistoryClothing() {
        return historyClothing;
    }

    public void setHistoryClothing(Clothing historyClothing) {
        this.historyClothing = historyClothing;
    }

    public Clothing getShoppingCartClothing() {
        return shoppingCartClothing;
    }

    public void setShoppingCartClothing(Clothing shoppingCartClothing) {
        this.shoppingCartClothing = shoppingCartClothing;
    }



}
