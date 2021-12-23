package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {

    public static final String result = "C:\\codeGym\\module2\\src\\ss16_io_text_file\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\result";

    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for(int i = 1 ; i < list.size() ; i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReadWriteAndFindMax readWriteAndFindMax = new ReadWriteAndFindMax();
        System.out.println("Nhập đường dẫn của file");
        List<Integer> numbers = readWriteAndFindMax.readFile(input.nextLine());

        int maxNumber = findMax(numbers);
        System.out.println("Nhâp đường dẫn file muốn write");
        readWriteAndFindMax.writeFile(input.nextLine(), maxNumber);
    }
}
