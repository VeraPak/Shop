package org.example.ProductServices.ProductCategories;

import org.example.ProductServices.Product;

public class Electronics extends Product {
    boolean isSupported;
    public Electronics(String productName, int productPrice, boolean isSupported) {
        super(productName, productPrice);
        this.isSupported = isSupported;
    }

    public void setSupported(boolean supported) {
        isSupported = supported;
    }
    public boolean isSupported() {
        return isSupported;
    }
}
