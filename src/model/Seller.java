
package model;

public class Seller extends User{
    
    private Accessories saleHistory;
    private Clothing productsToSale;
    
    
    public Seller(String name, String lastName, String id, String email, String password, String nameUser,String picture) {
        super(name, lastName, id, email, password, nameUser, picture);
        saleHistory = null;
        productsToSale = null;
    }

    public Accessories getSaleHistory() {
        return saleHistory;
    }

    public void setSaleHistory(Accessories saleHistory) {
        this.saleHistory = saleHistory;
    }

    public Clothing getProductsToSale() {
        return productsToSale;
    }

    public void setProductsToSale(Clothing productsToSale) {
        this.productsToSale = productsToSale;
    }
    
    
}
