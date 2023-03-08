package ss12_excercise_java_collection_framework.service;

import ss12_excercise_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface productService {
    ArrayList<Product> findAll();

    void addProduct(Product product);

    void editProduct(int idProduct);

    void deleteProduct(int product);

    void showProduct();

    void searchProduct(String nameProduct);

    List<Product> sortAscendingByPrice();

    List<Product> sortDescendingByPrice();

}
