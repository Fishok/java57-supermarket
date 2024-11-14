package service;

import model.Product;

import java.time.LocalTime;
import java.util.Arrays;

public class SupermarketImpl implements Supermarket {
    private String name;
    private String address;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private Product[] products;
    private int size = 100;

    public SupermarketImpl(String name, String address) {
        this.name = name;
        this.address = address;
        this.products = new Product[size];
    }

    @Override
    public Product getProduct(int barCode, int quantity) {
        Product foundProduct = null;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode) {
                foundProduct = products[i];
                index = i;
                break;
            }
        }
        if (foundProduct == null || foundProduct.getCount() < quantity) {
            return null;
        }
        products[index].setCount(products[index].getCount() - quantity);
        foundProduct.setCount(quantity);
        return foundProduct;
    }

    @Override
    public Product addNewProduct(Product product) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == product.getBarCode()) {
                updateCountOfProduct(product.getBarCode(), products[i].getCount() + product.getCount());
                break;
            }
        }
        if (size == products.length) {
            System.arraycopy(products, 0, products, 0, products.length * 2);
        }
        products[size + 1] = product;
        return product;
    }

    @Override
    public int updateCountOfProduct(int barCode, int count) {
        int newCount = count;
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode) {
                products[i].setCount(products[i].getCount() + count);
                newCount += products[i].getCount();
                break;
            }
        }

        return newCount;
    }

    @Override
    public void removeProductFromSupermarket(int barCode) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode) {
                for (int j = i; j < size; j++) {
                    products[j] = products[j + 1];
                }
                products[size - 1] = null;
                size--;
                break;
            }
        }
    }
    @Override
    public int getCountOfProductKinds() {
        return size;
    }

    @Override
    public void sortProducts() {
        Arrays.sort(products);
    }
}
