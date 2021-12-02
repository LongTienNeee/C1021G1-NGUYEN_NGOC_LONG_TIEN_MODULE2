package ss2_loop_in_java.thuc_hanh.tim_uoc_chung_lon_nhat;

import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter b");
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common divisor");
        }

         while(a != b){
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("Greater common divisor is " + a);
    }
}
