package bai_tap_ve_nha_huong_doi_tuong.bai_1;

import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng thí sinh");
        int numberOfCandidate = input.nextInt();
        Candidate[] candidates = new Candidate[numberOfCandidate];

        for( int i = 0 ; i < candidates.length ; i++ ){
            System.out.println("Thí sinh " + (i+1));
            System.out.println("Nhập số báo danh");
              int registrationNumber = input.nextInt();

            System.out.println("Nhập tên thí sinh");
              String nameOfCandidate = input.nextLine();

            System.out.println("Nhập ngày/tháng/năm sinh");
              String dateOfBirth = input.nextLine();

            System.out.println("Nhập điểm Toán");
              double markMath = Double.parseDouble(input.nextLine());

            System.out.println("Nhập điểm Văn");
            double markLiterature = Double.parseDouble(input.nextLine());

            System.out.println("Nhập điểm Tiếng anh");
            double markEnglish =  Double.parseDouble(input.nextLine());
            System.out.println("--------------------------------------------");
            candidates[i] = new Candidate(registrationNumber,
                                          nameOfCandidate,
                                          dateOfBirth,
                                          markMath,
                                          markLiterature,
                                          markEnglish);
        }
        System.out.println("Candidate have mark more than 15");
        for(Candidate candidate : candidates){
            if(candidate.getTotalMark() > 15){
                System.out.println(candidate);
            }
        }
    }
}
