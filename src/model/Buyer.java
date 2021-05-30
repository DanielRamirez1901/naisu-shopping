package model;

public class Buyer extends User {

    private Product history;
    private Product shoppingCart;

    public Buyer(String name, String lastName, String id, String email, String password, String nameUser, String picture) {
        super(name, lastName, id, email, password, nameUser,picture);
        history = null;
        shoppingCart = null;
    }

    public Product getHistory() {
        return history;
    }

    public void setHistory(Product history) {
        this.history = history;
    }

    public Product getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Product shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

}
