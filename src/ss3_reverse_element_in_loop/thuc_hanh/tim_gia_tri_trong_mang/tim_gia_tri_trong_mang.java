package ss3_reverse_element_in_loop.thuc_hanh.tim_gia_tri_trong_mang;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        int index = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        String[] nameOfBestTeacher = {"Truong Tan Hai", "Hai Truong", "Tan Hai", "Hai"};

        System.out.println("Enter name");
        String name = input.nextLine();

        for (int i = 0; i < nameOfBestTeacher.length; i++) {
            if (name.equals(nameOfBestTeacher[i])) {
                index = i;
                count++;
            }
        }
        if(count == 1){
            System.out.println("the best teacher at index : " + index);
        } else {
            System.out.println("This teacher is not here. But do you know teacher Hai");
        }
    }
}

