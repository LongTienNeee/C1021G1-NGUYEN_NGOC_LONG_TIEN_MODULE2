package ss1_introduction_to_java.thuc_hanh.giai_phuong_trinh_bac_1;

import java.util.Scanner;

public class giai_phuong_trinh_bac_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Liner Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants : ");

        System.out.print("Enter a : ");
        double a = input.nextDouble();

        System.out.print("Enter b : ");
        double b = input.nextDouble();

        System.out.print("Enter c : ");
        double c = input.nextDouble();

        if (a != 0) {
            double total = (c - b) / a;
            System.out.print("x = " + total);
        } else {
            if (b == c) {
                System.out.print("Phương trình có vô số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }

        }
    }
}
