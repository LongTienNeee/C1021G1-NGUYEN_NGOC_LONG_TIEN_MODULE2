package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your color you want");
        String color = input.nextLine();

        Triangle triangle2 = new Triangle(5.0f, 6.0f , 7.0f, color);
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2);
        System.out.println(triangle2.getArea());

    }
}
