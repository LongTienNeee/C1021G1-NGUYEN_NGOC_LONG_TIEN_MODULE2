package ss3_reverse_element_in_loop.thuc_hanh.dao_nguoc_cac_phan_tu_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class dao_nguoc_cac_phan_tu_trong_mang {
    public static void main(String[] args){
        int size;
        int[] array ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of array");
         size = input.nextInt();
         array = new int[size];

        for(int i=0;i<size;i++){
            if(size > 20){
                System.out.println("The length of array is not more than 20");
                break;
            } else {
                System.out.println("Enter element at index " + i);
                array[i] = input.nextInt() ;
            }
        }
        System.out.println("Before Reverse : " + Arrays.toString(array));

        int begin = 0;
        int last = array.length - 1 ;
        while(begin < last){
            int temp;
            temp = array[begin];
            array[begin] = array[last];
            array[last] = temp;
            begin++;
            last--;
        }

        System.out.println("After Reverse : " + Arrays.toString(array) );

    }
}
