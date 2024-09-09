package com.example.bean;

import java.util.Objects;

public class Products {
    private String productName;
    private String productId;
    private double productPrice;
    private String productWeight;
    private String productDetails;
    public Products(){
    }

    public Products(String productName, String productId, double productPrice, String productWeight, String productDetails) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productDetails = productDetails;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(productPrice, products.productPrice) == 0 && Objects.equals(productName, products.productName) && Objects.equals(productId, products.productId) && Objects.equals(productWeight, products.productWeight) && Objects.equals(productDetails, products.productDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productId, productPrice, productWeight, productDetails);
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", productPrice=" + productPrice +
                ", productWeight='" + productWeight + '\'' +
                ", productDetails='" + productDetails + '\'' +
                '}';
    }
}
