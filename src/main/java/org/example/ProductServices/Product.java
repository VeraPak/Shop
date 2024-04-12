package org.example.ProductServices;
public class Product {
    private String productName;
    private int productPrice;
    private String productDescription;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void changePrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setDescription(String description){
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getDescription(){
        return productDescription;
    }

    @Override
    public String toString() {
        return "Product "
                + productName + ", "
                + productPrice + "руб";
    }
}
