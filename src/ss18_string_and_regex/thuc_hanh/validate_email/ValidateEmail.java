package ss18_string_and_regex.thuc_hanh.validate_email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

    private static final String VALIDATE_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            String validateEmail = VALIDATE_EMAIL;

            Pattern pattern = Pattern.compile(validateEmail);
            System.out.println("Vui lòng nhập email của bạn");
            String yourEmail = input.nextLine();
            Matcher matcher = pattern.matcher(yourEmail);

            if (matcher.matches()) {
                System.out.println("Email : " + yourEmail + " -- Hợp lệ");
            } else {
                System.out.println("Email : " + yourEmail + " -- Không hợp lệ");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }
}
