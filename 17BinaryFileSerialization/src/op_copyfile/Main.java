package op_copyfile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream(("E:\\jame-md2\\ProjectW4\\17BinaryFileSerialization\\src\\productmanager\\products.txt")));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(("E:\\jame-md2\\ProjectW4\\17BinaryFileSerialization\\src\\op_copyfile\\target")));
            byte read;
            int count = 0;
            while ((read = (byte) inputStream.read()) != -1) {
                outputStream.write(read);
                count++;
            }
            outputStream.close();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
