package ss16_io_text_file.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.io.*;

public class ReadFileNumber {
    public void readFileText(String filePath)    {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
//            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
//                sum += Integer.parseInt(line);
            }
            br.close();
//            System.out.println("Tổng = " + sum );
        } catch (Exception e){
            System.err.println("File không tồn tại");
        }
    }
}
