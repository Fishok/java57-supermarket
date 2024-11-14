package model;

import enums.ProductType;

import java.util.Objects;


public class Product implements Comparable<Product> {

    private int barCode;
    private String productName;
    private int productPrice;
    private int count;
    private ProductType productType;


    public Product(int barCode, String productName, int productPrice, int count, ProductType productType) {
        this.barCode = barCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.count = count;
        this.productType = productType;
    }

    public int getBarCode() {
        return barCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Product product = (Product) other;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }


    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", count=" + count +
                ", productType=" + productType +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getProductType().compareTo(o.getProductType());
    }
}
