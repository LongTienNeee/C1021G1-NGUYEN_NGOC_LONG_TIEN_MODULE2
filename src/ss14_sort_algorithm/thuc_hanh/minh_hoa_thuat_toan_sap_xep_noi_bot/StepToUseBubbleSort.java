package ss14_sort_algorithm.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;



import java.util.Arrays;
import java.util.Scanner;

public class StepToUseBubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr.length - 1 ; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.println("Enter element at index " + i);
            arr[i] = input.nextInt();
        }
        System.out.println("Before : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After : ");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


