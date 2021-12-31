package baitap.validatephonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            String NUMBER_REGEX = "^[(][+][0-9]{2}[)][-][0-9]{10}$";
            System.out.println("Nhập số điện thoại");
            String regex = scanner.next();
            Pattern pattern = Pattern.compile(NUMBER_REGEX);
            Matcher matcher = pattern.matcher(regex);
            if (matcher.find()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } while (true);
    }
}
