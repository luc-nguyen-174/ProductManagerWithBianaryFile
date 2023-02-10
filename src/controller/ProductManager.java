package controller;

import model.Product;
import storage.ReadAndWrite;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Serializable {
    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
        try {
            ReadAndWrite.writeToFile(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product searchProducts(int maSP) {
        for (Product product : products) {
            if (product.getMaSanPham() == maSP) {
                System.out.println("Product found: " + product);
            } else {
                System.out.println("Product not found");
            }
        }

        return null;
    }
    public List<Product> clearProduct() {
        products.clear();
        try {
            ReadAndWrite.writeToFile(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
