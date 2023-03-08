package ss12_excercise_java_collection_framework.model;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int idProduct;
    private String nameProduct;
    private int price;


    public Product() {
    }

    public Product(int idProduct) {
        this.idProduct = idProduct;
    }

    public Product(int idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    public Product(int idProduct, String nameProduct, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.price == o2.getPrice()) {
            return 0;
        } else if (o1.price > o2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
