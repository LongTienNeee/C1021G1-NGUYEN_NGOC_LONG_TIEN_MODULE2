package ss3_reverse_element_in_loop.bai_tap.tinh_tong_cac_so_o_cot;

import java.util.Arrays;
import java.util.Scanner;

public class tinh_tong_cac_so_o_cot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rowspan of array");
        int row = input.nextInt();
        System.out.println("Enter colspan of array ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.println("Enter element at index ["+i+"]"+"["+j+"]");
                matrix[i][j] = input.nextInt();
            }
        }

        int sum = 0;
            for(int k = 0 ; k < row ; k++){
                   sum += matrix[k][1];

        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Total  = " + sum);
    }
}
