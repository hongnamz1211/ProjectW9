package thuchanh.validateemail;

public class Main {
    private static ValidateEmail validateEmail;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotromail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for (String e :
                validEmail) {
            boolean isvalid = validateEmail.validate(e);
            System.out.println("Email is " + e + " is valid " + isvalid);
        }
        for (String e :
                invalidEmail) {
            boolean isvalid = validateEmail.validate(e);
            System.out.println("Email is " + e + " is valid " + isvalid);
        }
    }
}
