package ss18_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    public static final String PHONE_NUMBER = "^[0-9]{2}(-)(0)[0-9]{9}$";

    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            String phoneNumber = PHONE_NUMBER;
            Pattern pattern = Pattern.compile(phoneNumber);
            System.out.print("Nhập số điện thoại của bạn : ");
            String yourPhoneNumber = input.nextLine();
            Matcher matcher = pattern.matcher(yourPhoneNumber);

            if (matcher.matches()) {
                System.out.println("Số điện thoại hợp lệ");
            } else {
                System.out.println("Số điện thoại không hợp lệ");
            }

        }
    }
}
