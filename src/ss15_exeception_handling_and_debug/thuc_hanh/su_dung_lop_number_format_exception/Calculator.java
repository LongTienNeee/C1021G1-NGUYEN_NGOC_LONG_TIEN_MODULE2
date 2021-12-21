package ss15_exeception_handling_and_debug.thuc_hanh.su_dung_lop_number_format_exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter b");
        int b = input.nextInt();
        Calculator cal = new Calculator();
        cal.calculator(a , b );

    }
    private void calculator(int a, int b ){
        try{
            int add = a + b;
            int sub = a - b;
            int mul = a * b;
            int div = a / b;
            System.out.println("Tổng a + b = " + add);
            System.out.println("Hiệu a - b = " + sub);
            System.out.println("Tích a * b = " + mul);
            System.out.println("Thương a / b = " + div);
        } catch (Exception e){
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }
}
