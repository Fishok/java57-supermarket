package controller;

import enums.ProductType;
import model.Product;

import java.util.Arrays;
import java.util.Comparator;

public class Appl {
    public static void main(String[] args) {
        Product[] products = new Product[10];

        products[0] = new Product(1001, "Apple", 50, 100, ProductType.FOOD);
        products[1] = new Product(1002, "Shampoo", 200, 50, ProductType.OTHER);
        products[2] = new Product(1003, "Notebook", 30, 200, ProductType.ELECTRONIC);
        products[3] = new Product(1004, "Laptop", 50000, 10, ProductType.ELECTRONIC);
        products[4] = new Product(1005, "Chair", 1500, 25, ProductType.OTHER);
        products[5] = new Product(1006, "Pen", 10, 500, ProductType.OTHER);
        products[6] = new Product(1007, "Coffee", 100, 150, ProductType.FOOD);
        products[7] = new Product(1008, "Television", 30000, 5, ProductType.ELECTRONIC);
        products[8] = new Product(1009, "Desk", 2500, 15, ProductType.OTHER);
        products[9] = new Product(1010, "Juice", 60, 80, ProductType.ALCOHOL);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        Arrays.sort(products);
        System.out.println("================================================================================================");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        System.out.println("================================================================================================");
        Comparator<Product> byPrice = (p1, p2) -> p1.getProductPrice() - p2.getProductPrice();
        Arrays.sort(products, byPrice);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
