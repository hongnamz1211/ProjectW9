package baitap.validateclass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
            System.out.println("Nhập tên lớp");
            String regex = scanner.next();
            Pattern pattern = Pattern.compile(CLASS_REGEX);
            Matcher matcher = pattern.matcher(regex);
            if (matcher.find()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } while (true);

    }
}
