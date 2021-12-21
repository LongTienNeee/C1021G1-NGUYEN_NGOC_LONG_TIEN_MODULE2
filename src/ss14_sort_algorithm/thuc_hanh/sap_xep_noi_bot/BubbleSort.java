package ss14_sort_algorithm.thuc_hanh.sap_xep_noi_bot;


import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(double[] arr) {
        boolean next = true;
        for(int i = 1 ; i < arr.length && next ; i++){
            next = false;
            for(int j = 0 ; j < arr.length - i ; j++){
                if(arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    next = true ;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {5.2,7.2,1.2,3.2,2.2,9.2,8.2,4.2,6.2};
        System.out.println("After :");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
    }
}



