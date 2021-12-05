package ss3_reverse_element_in_loop.bai_tap.tim_phan_tu_lon_nhat_cua_mang_2_chieu;

import java.util.Arrays;
import java.util.Scanner;

public class tim_phan_tu_lon_nhat_cua_mang_2_chieu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row");
        int row = input.nextInt();
        System.out.println("Enter col");
        int col = input.nextInt();
        int[][] matrix = new int[row][col];

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.println("Enter element at index ["+i+"]"+"["+j+"]");
                matrix[i][j] = input.nextInt();
            }
        }

        int max = matrix[0][0];
        for(int h = 0 ; h < row ; h++){
            for(int k = 0 ; k < col ; k++){
                if(matrix[h][k] > max){
                    max = matrix[h][k];
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("The best element in array is " + max);
    }
}
