package storage;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeToFile(List<Product> products) throws IOException {
//        System.out.println("Enter path:");
        File file = new File("demo.txt");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(products);
        oos.close();
        os.close();
    }

    public static List<Product> readFromFile() {
        File file = new File("demo.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(is);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (ois != null) {
                List<Product> products = null;
                try {
                    products = (List<Product>) ois.readObject();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                return products;
            } else {
                return new ArrayList<>();
            }
        }

    }
}
