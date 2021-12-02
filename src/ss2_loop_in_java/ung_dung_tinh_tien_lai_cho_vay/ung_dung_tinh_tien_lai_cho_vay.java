package ss2_loop_in_java.ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng tiền cho vay ");
        double sotienchovay = input.nextDouble();

        System.out.println("Nhập lãi suất theo tháng ");
        float laisuattheothang = input.nextFloat();

        System.out.println("Nhập số tháng cho vay");
        int sothangchovay = input.nextInt();

    }
}
