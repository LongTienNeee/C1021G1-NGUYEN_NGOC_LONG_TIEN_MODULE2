package bai_tap_ve_nha_huong_doi_tuong.bai_3;

import java.util.Scanner;

public class TestCadres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng cán bộ");
        int numberOfCadres = input.nextInt();
        Cadres[] cadres = new Cadres[numberOfCadres];

        for(int i = 0 ; i < cadres.length ; i++){
            System.out.println("Cán bộ " + (i+1));
            System.out.println("Nhập ID của cán bộ");
               int ID = input.nextInt();
            System.out.println("Nhập tên của cán bộ");
                String fullName = input.nextLine();
            System.out.println("Nhập giới tính của cán bộ");
                String gender = input.nextLine();
            System.out.println("Nhập Quê quán của cán bộ");
                String country = input.nextLine();
            System.out.println("Nhập năm sinh của cán bộ");
                int yearOfBirth = input.nextInt();
            System.out.println("Nhập chuyên môn của cán bộ");
                String specialized = input.nextLine();
            System.out.println("Nhập Trình độ của cán bộ");
                String level = input.nextLine();
            System.out.println("Nhập hệ số lương của cán bộ");
                double levelOfSalary = input.nextDouble();
            System.out.println("Nhập phụ cấp");
                double subsidize = input.nextDouble();
            cadres[i] = new Cadres(ID, fullName, gender, country, yearOfBirth, specialized, level, levelOfSalary, subsidize);
        }

        System.out.println("Danh sách cán bộ");
        for(Cadres cadresX : cadres){
            System.out.println(cadresX);
        }
        System.out.println();


        System.out.println("------------------------------------------");
        System.out.println("Số lượng cán bộ nữ trong cơ quan là");
        int numberOfWoman = 0;
        for(Cadres cadresA : cadres){
            if (isWoman(cadresA)) {
                numberOfWoman = numberOfWoman + 1;
            }
        }
        System.out.println(numberOfWoman);
        System.out.println();



        System.out.println("--------------------------------------------");
        System.out.println("Tổng thu nhập của các cán bộ trong danh sách là");
        double totalSalaryOfAll = 0 ;
        for(Cadres cadresB : cadres){
            totalSalaryOfAll += cadresB.getNetSalary();
        }
        System.out.println(totalSalaryOfAll);
        System.out.println();


        System.out.println("--------------------------------------------");
        for(Cadres cadresC : cadres){
            if(isIT(cadresC)){
                System.out.println(cadresC);
            }
        }
    }

    private static boolean isIT(Cadres cadresC) {
        return cadresC.getSpecialized().equals("Công nghệ thông tin");
    }

    private static boolean isWoman(Cadres cadresA) {
        return cadresA.getGender().equals("nữ") || cadresA.getGender().equals("Nữ");
    }
}
