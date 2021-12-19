package ss14_sort_algorithm.thuc_hanh.thuat_toan_sap_xep_chon;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp ;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,1,2,9,7,8,3,4};
        System.out.println("Before : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("After : ");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
