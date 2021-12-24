package ss18_string_and_regex.thuc_hanh.validate_account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {

    public static final String VALIDATE_ACCOUNT = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            String validateAccount = VALIDATE_ACCOUNT;
            Pattern pattern = Pattern.compile(validateAccount);
            System.out.println("Nhập Tên tài khoản");
            String nameAccount = input.nextLine();
            Matcher matcher = pattern.matcher(nameAccount);
            if (matcher.matches()) {
                System.out.println("Tên tài khoản hợp lệ");
            } else {
                System.out.println("Tên tài khoản không hợp lệ");
            }
            System.out.println("__________________");
        }
    }
}
