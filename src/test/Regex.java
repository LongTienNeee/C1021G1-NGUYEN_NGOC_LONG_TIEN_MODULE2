package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String regex = "[1-9]{3}$";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Vui lòng nhập số có 3 chữ số");
        Matcher matcher = pattern.matcher(input.nextLine());

        if(matcher.matches()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
