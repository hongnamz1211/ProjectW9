package productmanager;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    List<Product> products;
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public Product createProduct() {
        System.out.println("Nhập mã sản phẩm");
        int id = scanner.nextInt();
        for (Product p :
                products) {
            if (p.getId() == id) {
                System.out.println("Trùng mã sản phẩm, nhập lại");
                return null;
            }
        }
        System.out.println("Nhập tên sản phẩm");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = scanner.nextInt();
        System.out.println("Nhập mô tả");
        scanner.nextLine();
        String type = scanner.nextLine();
        Product product = new Product(id, name, brand, price, type);
        products.add(product);
        return product;
    }

    public void displayProduct(int id) {
        Product product = null;
        for (Product p :
                products) {
            if (p.getId() == id) {
                product = p;
            }
        }
        System.out.println(product);
    }

    public void displayAll() {
        for (Product p :
                products) {
            System.out.println(p);
        }
    }

    public void writeToFile(String path) throws IOException{
        try {
            OutputStream out;
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(products);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(String path) throws IOException {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
