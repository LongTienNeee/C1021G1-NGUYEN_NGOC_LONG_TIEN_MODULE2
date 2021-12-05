package ss3_reverse_element_in_loop.thuc_hanh.chuyen_doi_nhiet_do;

import java.util.Scanner;

public class chuyen_doi_nhiet_do {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter c to change to f");
        double c = input.nextDouble();
        System.out.println(c + " C = " + cToF(c) + " F");

        System.out.println();
        System.out.println("Enter f to change to c");
        double f = input.nextDouble();
        System.out.println(f + " F = " +fToC(f) + " C");

    }
    public static double cToF(double c) {
        double f;
        f = c / (5.0 / 9) + 32;
        return f;
    }

    public static double fToC(double f) {
        double c;
        c = (5.0 / 9) * (f - 32);
        return c;

    }
}
