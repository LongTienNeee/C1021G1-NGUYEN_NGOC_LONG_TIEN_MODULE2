package ss1_introduction_to_java.thuc_hanh.tinh_so_can_nang_cua_co_the;

import java.util.Scanner;

public class tinh_so_can_nang_cua_co_the {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Height");
        double height = input.nextFloat();

        System.out.println("Enter your Weight");
        double weight = input.nextFloat();

        double bmi = weight / Math.pow(height, 2);

        if(bmi >= 30){
            System.out.println( bmi + " : You are Obese");
        } else if(bmi >= 25){
            System.out.println( bmi + " : You are OverWeight");
        } else if(bmi >= 18.5){
            System.out.println( bmi + " : You are Normal");
        } else {
            System.out.println( bmi + " : You are UnderWeight");
        }

    }
}
