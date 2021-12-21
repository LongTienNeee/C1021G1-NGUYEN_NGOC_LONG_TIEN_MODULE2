package ss15_exeception_handling_and_debug.bai_tap.xu_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class TriangleChecked {
    public void checkTriangle(int a , int b ,int c) throws TriangleException{
        if(a + b <= c || a + c <= b || b + c <= a){
            throw new TriangleException("Lỗi : Tam giác không hợp lệ");
        } else {
            System.out.println("Tam giác hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TriangleChecked triangle = new TriangleChecked();

        try{
            System.out.println("Nhập cạnh a");
            int a = Integer.parseInt(input.nextLine());
            System.out.println("Nhập cạnh b");
            int b = Integer.parseInt(input.nextLine());
            System.out.println("Nhập cạnh c");
            int c = Integer.parseInt(input.nextLine());
            try {
                triangle.checkTriangle(a, b, c);
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Hãy nhập cạnh dương");
            }
        } catch (Exception e){
            System.out.println("Lỗi 1 cạnh");
        }
    }
}


