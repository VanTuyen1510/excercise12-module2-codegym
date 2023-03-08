package ss12_excercise_java_collection_framework.repository;


import ss12_excercise_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    // giả lập Database
//    interface bắt buộc ghi đè tất cả phương thức
 private static List<Product> products  = new ArrayList<>();
 private static int size = 0;
    static {
        Product product1 = new Product(1,"A1",1000);
        Product product2 = new Product(2, "A3",3000);
        Product product3 = new Product(3, "A2",2000);
        Product product4 = new Product(4, "A5",5000);
        Product product5 = new Product(5,"A4",4000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }


    public ArrayList<Product> findAll() {
        List<Product> product = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            product.set(i, products.get(i));
        }
        return (ArrayList<Product>) products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct(int idProduct) {
        for (int i = 0; i < products.size(); i++) {
            if(idProduct == products.get(i).getIdProduct()){
                products.set(i, (Product) products);
            }
        }
    }

    @Override
    public List<Product> deleteProduct(int idProduct) {
        for (int i = 0; i < products.size(); i++) {
            if(idProduct == products.get(i).getIdProduct()){
                products.remove(idProduct);
            }
        }
        return products;
    }

    @Override
    public void showProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public void searchProduct(String nameProduct) {
        List<Product> sameNameProducts = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getNameProduct().equals(nameProduct)){
                sameNameProducts.add(products.get(i));
            }
        }
        System.out.println("Sản phẩm của bạn muốn tìm  là :" + sameNameProducts);
    }

    @Override
    public List<Product> sortAscendingByPrice() {

        Collections.sort(products,new Product());
        for(Product product : products){
            System.out.println(product);
        }
        return products;
    }

    @Override
    public List<Product> sortDescendingByPrice() {
         Collections.sort(products,new Product());
         Collections.reverse(products);
        for(Product product : products) {
            System.out.println(product);
        }
      return products;
    }



}
