package ss14_sort_algorithm.thuc_hanh.sap_xep_noi_bot;


import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        boolean next = true;
        for(int i = 1 ; i < arr.length   && next ; i++){
            next = false;
            for(int j = 0 ; j < arr.length - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    next = true ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,3,2,9,8,4,6};
        System.out.println("After :");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
    }
}



