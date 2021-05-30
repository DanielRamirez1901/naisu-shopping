
package model;

public class Seller extends User{
    private Product saleHistory;
    private Product productsToSale;
    public Seller(String name, String lastName, String id, String email, String password, String nameUser) {
        super(name, lastName, id, email, password, nameUser);
        saleHistory = null;
        productsToSale = null;
    }

    public Product getSaleHistory() {
        return saleHistory;
    }

    public void setSaleHistory(Product saleHistory) {
        this.saleHistory = saleHistory;
    }

    public Product getProductsToSale() {
        return productsToSale;
    }

    public void setProductsToSale(Product productsToSale) {
        this.productsToSale = productsToSale;
    }
    
    
}
