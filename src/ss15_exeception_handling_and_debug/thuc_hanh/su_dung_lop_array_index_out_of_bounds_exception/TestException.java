package ss15_exeception_handling_and_debug.thuc_hanh.su_dung_lop_array_index_out_of_bounds_exception;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr =  arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chỉ số của vị trí bất kí");
        int x = input.nextInt();
        try{
            System.out.println("Gía trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e ){
            System.out.println("Lỗi : Chỉ số vượt quá độ dài mảng");
        }
    }
}
