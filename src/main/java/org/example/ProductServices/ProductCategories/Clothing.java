package org.example.ProductServices.ProductCategories;

import org.example.ProductServices.Discount;
import org.example.ProductServices.Product;

public class Clothing extends Product implements Discount {

    public Clothing(String productName, int productPrice) {
        super(productName, productPrice);
    }

    @Override
    public void discountedPrice(int percent) {
        int discountAmount = getProductPrice() * percent / 100;
        changePrice(getProductPrice() - discountAmount);
    }
}
