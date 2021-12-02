package ss2_loop_in_java.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number");
            int number = input.nextInt();

            int count = 0;
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    count += 1;
                }
            }
            if(count == 2){
                System.out.println("This is a Prime number");
            } else {
                System.out.println("This is not a Prime number");
            }
        }
}
