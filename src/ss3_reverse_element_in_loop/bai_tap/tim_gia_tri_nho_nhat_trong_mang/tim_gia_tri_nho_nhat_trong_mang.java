package ss3_reverse_element_in_loop.bai_tap.tim_gia_tri_nho_nhat_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the length of array");
                int length = input.nextInt();
                int[] arr = new int[length];
                int i = 0;
                for(int ignored : arr){
                        System.out.println("Enter the element at index " + i);
                        arr[i] = input.nextInt();
                        i++;
                }

                int max = arr[0];
                for(int element : arr){
                     if(element > max){
                             max = element;
                     }
                }
                System.out.println();
                System.out.println(Arrays.toString(arr));
                System.out.println("The largest element in array is " + max);
        }
}
