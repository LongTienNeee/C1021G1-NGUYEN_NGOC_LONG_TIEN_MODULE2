package ss2_loop_in_java.thuc_hanh.thiet_ke_menu_cho_ung_dung;

import java.util.Scanner;

public class thiet_ke_menu_cho_ung_dung {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 1;
    while (choice != 0) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the Square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The Triangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 2:
                System.out.println("The Rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("The Square");
                System.out.println("*  *  *  *  *  *");
                System.out.println("*  *  *  *  *  *");
                System.out.println("*  *  *  *  *  *");
                System.out.println("*  *  *  *  *  *");
                System.out.println("*  *  *  *  *  *");
                System.out.println("*  *  *  *  *  *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");

        }
    }
    }
}
