package ss12_excercise_java_collection_framework.service;

import ss12_excercise_java_collection_framework.model.Product;
import ss12_excercise_java_collection_framework.repository.ProductRepository;
import ss12_excercise_java_collection_framework.repository.ProductRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements productService{
    private ProductRepository repository = new ProductRepositoryImpl();

    public ArrayList<Product> findAll(){
        return repository.findAll();
    }

    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    public void editProduct(int idProduct) {
        repository.editProduct(idProduct);
    }

    public void deleteProduct(int idProduct) {
        repository.deleteProduct(idProduct);
    }

    public void showProduct() {
        repository.showProduct();
    }

    public void searchProduct(String nameProduct) {
        repository.searchProduct(nameProduct);
    }

    @Override
    public List<Product> sortAscendingByPrice() {
       return repository.sortAscendingByPrice();
    }

    @Override
    public List<Product> sortDescendingByPrice() {
      return repository.sortDescendingByPrice();
    }


}
