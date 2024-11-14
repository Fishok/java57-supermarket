package service;

import model.Product;

public interface Supermarket {

    Product getProduct(int barCode, int quantity);

    Product addNewProduct(Product product);

    int updateCountOfProduct(int barCode, int count);

    void removeProductFromSupermarket(int barCode);

    int getCountOfProductKinds();

    void sortProducts();

}
