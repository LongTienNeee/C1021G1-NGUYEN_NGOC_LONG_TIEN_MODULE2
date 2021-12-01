package ss1_introduction_to_java.thuc_hanh.kiem_tra_nam_nhuan;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập năm để kiểm tra");
        int year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 ==0) {
                if(year % 400 == 0) {
                    System.out.println( year + " Đây là năm nhuận");
                } else {
                    System.out.println( year + " Đây là năm nhuận");
                }
            }else{
             System.out.println( year + " Đây là năm nhuận");
            }
        } else {
            System.out.println( year + " Đây là năm không nhuận");
        }

    }
}
