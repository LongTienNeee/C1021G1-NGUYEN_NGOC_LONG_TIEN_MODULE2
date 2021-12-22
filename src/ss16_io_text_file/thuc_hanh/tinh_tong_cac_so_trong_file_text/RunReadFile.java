package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;

public class RunReadFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhâp đường dẫn file");
        String linkFile = input.nextLine();

        ReadFileNumber fileNumber = new ReadFileNumber();
        fileNumber.readFileText(linkFile);
    }
}
