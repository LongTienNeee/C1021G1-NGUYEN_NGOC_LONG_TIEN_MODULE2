package ss4_class_and_object.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width");
        double width = input.nextDouble();
        System.out.println("Enter height");
        double height = input.nextDouble();

        //Object
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println(rectangle.display());
    }
}

