package views;

import controller.ProductManager;
import model.Product;
import storage.ReadAndWrite;

import java.io.IOException;
import java.util.*;

public class Client {
    public static List<Product> products = ReadAndWrite.readFromFile();


    public static ProductManager productManager = new ProductManager(products);
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Product product = new Product(1, "test1",
                "nokia", 5000, "1");
        Product product2 = new Product(2, "test2",
                "nokia", 6000, "2");
        productManager.addProduct(product);
        productManager.addProduct(product2);
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Display products");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            System.out.println("5. Clear");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter product code: ");
                    int maSanPham = in.nextInt();
                    System.out.print("Enter product name: ");
                    String tenSP = in.nextLine();
                    System.out.print("Enter manufacturer: ");
                    String hangSanXuat = in.nextLine();
                    System.out.print("Enter price: ");
                    double gia = in.nextDouble();
                    in.nextLine();
                    System.out.print("Enter description: ");
                    String moTaKhac = in.nextLine();
                    productManager.addProduct(new Product(maSanPham, tenSP, hangSanXuat, gia, moTaKhac));
                }
                case 2 -> {
                    if (productManager != null) {
                        productManager.displayProducts();
                    } else {
                        System.out.println("null");
                    }
                }
                case 3 -> {
                    System.out.println("Enter ID:");
                    int id = in.nextInt();
                    if (productManager.searchProducts(id) == null) {
                        System.out.println("Product not found");
                    } else {
                        System.out.println(productManager.searchProducts(id));
                    }
                }
                case 4 -> {
                    System.exit(0);
                }
                case 5 -> {
                    System.out.println("Clear successfully");
                    productManager.clearProduct();
                }
                default -> System.out.println("Invalid");
            }

        }
    }
}
