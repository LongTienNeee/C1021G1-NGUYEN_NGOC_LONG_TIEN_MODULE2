package ss4_class_and_object.thuc_hanh.xay_dung_lop_phuong_trinh_bac_2;

import java.util.Scanner;

    public class main {
        public main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a");
            double a = input.nextDouble();
            System.out.println("Enter b");
            double b = input.nextDouble();
            System.out.println("Enter c");
            double c = input.nextDouble();
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

            System.out.println(quadraticEquation.getDiscriminant());

        }
    }


