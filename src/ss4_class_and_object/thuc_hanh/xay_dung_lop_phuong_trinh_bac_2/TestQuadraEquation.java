package ss4_class_and_object.thuc_hanh.xay_dung_lop_phuong_trinh_bac_2;

import java.util.Scanner;

public class TestQuadraEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();

        QuadraEquation quadraEquation = new QuadraEquation(a, b ,c);
        System.out.println(quadraEquation.getDiscriminants());
//        System.out.println(quadraEquation.getRoot1());
    }
}
