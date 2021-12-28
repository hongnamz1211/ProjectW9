package productmanager;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final ProductManager productManager = new ProductManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        try {
            do {
                System.out.println("-----Menu-----");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Tìm kiếm sản phẩm");
                System.out.println("3. Hiển thị tất cả sản phẩm");
                System.out.println("4. Lưu file nhị phân");
                System.out.println("5. Đọc file nhị phân");
                System.out.println("6. Tìm kiếm sản phẩm trong file nhị phân");
                System.out.println("--------------");
                System.out.println("Nhập lựa chọn");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        productManager.createProduct();
                        break;
                    case 2:
                        System.out.println("Nhập id sản phẩm");
                        int id = scanner.nextInt();
                        productManager.displayProduct(id);
                        break;
                    case 3:
                        productManager.displayAll();
                        break;
                    case 4:
                        System.out.println("Nhập đường dẫn file");
                        String pathWrite = scanner.nextLine();
                        productManager.writeToFile(pathWrite);
                        break;
                    case 5:
                        System.out.println("Nhập đường dẫn file");
                        String pathRead = scanner.nextLine();
                        List<Product> productList = productManager.readDataFromFile(pathRead);
                        for (Product p :
                                productList) {
                            System.out.println(p);
                        }
                        break;
                    case 6:
                        System.out.println("Nhập đường dẫn file");
                        String path = scanner.nextLine();
                        System.out.println("Nhập id sản phẩm");
                        int id1 = scanner.nextInt();
                        Product product = null;
                        for (Product p : productManager.readDataFromFile(path)) {
                            if (p.getId() == id1) {
                                product = p;
                            }
                        }
                        System.out.println(product);
                        break;
                }
            } while (choice != 0);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
