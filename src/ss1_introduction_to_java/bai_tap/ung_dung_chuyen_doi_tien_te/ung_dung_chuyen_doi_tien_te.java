package ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter USD");
        double USD = input.nextDouble();
        double VND = USD * 23000;
        System.out.println(VND + " VND");
    }
}
