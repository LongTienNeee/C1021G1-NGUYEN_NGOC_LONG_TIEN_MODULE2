package ss3_reverse_element_in_loop.thuc_hanh.ung_dung_dem_so_sinh_vien_thi_do;

import java.util.Arrays;
import java.util.Scanner;

public class ung_dung_dem_so_sinh_vien_thi_do {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length;
        int i = 0;
        int count = 0;

        do {
            System.out.println("Enter the number of students");
             length = input.nextInt();
            if (length > 30) {
                System.out.println("The number of students is not more than 30");
            }
            } while (length > 30) ;

        int[] score = new int[length];
        for(int element : score) {
            System.out.println("Enter the score of Student " + (i + 1));
            score[i] = input.nextInt();{
                if(score[i] >= 5 && score[i] <= 10){
                    count++;
                }
            }
            i++;
        }

        System.out.println(Arrays.toString(score));
        System.out.println("Have " + count + " students is pass the exam");
        System.out.println("Have " +(length - count) + " student is not pass the exam");
    }
}
