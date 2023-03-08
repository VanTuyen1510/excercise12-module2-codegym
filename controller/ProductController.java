package ss12_excercise_java_collection_framework.controller;

import ss12_excercise_java_collection_framework.model.Product;
import ss12_excercise_java_collection_framework.service.ProductServiceImpl;
import ss12_excercise_java_collection_framework.service.productService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private static productService service = new ProductServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-------Product Management------");
            System.out.println("1. List");
            System.out.println("2. Add new Product");
            System.out.println("3. Delete");
            System.out.println("4.Search");
            System.out.println("5.Sort products in ascending order by price");
            System.out.println("6.Sort products in descending order by price");
            System.out.println("7.Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1://list
                    ArrayList<Product> products = service.findAll();
                    for (Product product: products){
                        System.out.println(product);
                    }
                    break;
                case 2://add
                    System.out.print("Input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name: ");
                    String name = scanner.nextLine();
                    Product product = new Product(id,name);
                    service.addProduct(product);
                    break;
                case 3://Delete
                    System.out.println("Input id :");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    service.deleteProduct(idDelete);
                    break;
                case 4:
                    System.out.print("Input name: ");
                    String nameShow = scanner.nextLine();
                    service.searchProduct(nameShow);
                    break;
                    // TODO : product bị gì đó ?
                case 5://Sort tăng dần theo giá
                    // List phải duyệt
                    for (Product product1 : service.sortAscendingByPrice()) {
                        System.out.println(product1);
                    }
                    break;
                case 6:// Sort giảm dần theo giá
                    for (Product product2 : service.sortDescendingByPrice()) {
                        System.out.println(product2);
                    }
                case 7://exit
                    System.exit(0);

            }
        } while (true);
    }
}
