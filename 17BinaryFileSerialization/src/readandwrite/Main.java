package readandwrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("E:\\jame-md2\\ProjectW4\\17BinaryFileSerialization\\src\\readandwrite\\students", students);
        List<Student> studentList = readDataFromFile("E:\\jame-md2\\ProjectW4\\17BinaryFileSerialization\\src\\readandwrite\\students");
        for (Student s :
                studentList) {
            System.out.println(s);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students  = (List<Student>) ois.readObject();
            ois.close();
        } catch (Exception exception ) {
            exception.printStackTrace();
        }
        return students;
    }
}
