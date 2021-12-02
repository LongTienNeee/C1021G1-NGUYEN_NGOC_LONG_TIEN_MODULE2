package ss1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter USD");
        double usd = input.nextDouble();
        double vnd = usd * 23000;
        System.out.println(vnd + " VND");
    }
}
