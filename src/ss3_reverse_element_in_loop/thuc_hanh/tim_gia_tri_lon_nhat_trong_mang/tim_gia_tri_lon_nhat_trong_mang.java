package ss3_reverse_element_in_loop.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0; i<array.length;i++){
            if(size > 20){
                System.out.println("The size is not more than 20");
                break;
            } else {
                System.out.println("Enter the element at index " + i);
                array[i] = input.nextInt();
            }

        }
        int max = array[0];
        for(int j=1;j<array.length;j++){
            if(array[j] > max){
                max = array[j];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The best number in array is " + max);
    }
}
