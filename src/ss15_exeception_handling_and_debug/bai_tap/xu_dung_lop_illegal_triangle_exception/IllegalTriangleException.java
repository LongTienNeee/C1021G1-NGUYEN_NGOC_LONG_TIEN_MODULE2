package ss15_exeception_handling_and_debug.bai_tap.xu_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side a");
        int a = input.nextInt();
        System.out.println("Enter side b");
        int b = input.nextInt();
        System.out.println("Enter side c");
        int c = input.nextInt();
        IllegalTriangleException triangle = new IllegalTriangleException();
        triangle.illegalTriangle(a ,b, c);
    }

    private void illegalTriangle(int a , int b, int c){
        if(a < 0
                || b < 0
                ||c < 0
                || a + b < c
                || a + c < b
                || b + c < a)
        try{
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        } catch (Exception e ){
            System.out.println("Xảy ra ngoại lệ ");
        }
    }
}
