package ss2_loop_in_java.thuc_hanh.ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter money");
        double money = input.nextDouble();

        System.out.println("Enter interest rate in percentage");
        float interestRate = input.nextFloat();

        System.out.println("Enter month");
        int month = input.nextInt();

        double total = 0;
        for(int i=0;i<month ;i++){
            total += money*(interestRate/12)*month;
        }
        System.out.println("Total your interest is " + total );
    }
}

