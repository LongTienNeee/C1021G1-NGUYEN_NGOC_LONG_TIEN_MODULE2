package ss1_introduction_to_java.thuc_hanh.su_dung_toan_tu;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Enter Width : ");
        width = scanner.nextFloat();

        System.out.println("Enter Height");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area = " +area);
    }
}
