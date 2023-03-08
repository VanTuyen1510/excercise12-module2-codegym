package ss12_excercise_java_collection_framework.repository;

import ss12_excercise_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository {
     ArrayList<Product> findAll();

    void addProduct(Product product);
    void editProduct(int idProduct);
    List<Product> deleteProduct(int idProduct);
    void showProduct();
    void searchProduct(String nameProduct);
    List<Product> sortAscendingByPrice();
    List<Product> sortDescendingByPrice();
}
