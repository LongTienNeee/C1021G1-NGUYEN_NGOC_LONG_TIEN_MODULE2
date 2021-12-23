package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class ReadWriteAndFindMax {

    //Method đọc file được truyền vào
    public List<Integer> readFile(String filePath) {
        List<Integer> listNumber = new LinkedList<>();
        try {
            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while((line = br.readLine()) != null ){
                listNumber.add(Integer.parseInt(line));
            }
            br.close();
            } catch (Exception e){
                System.err.println("Lỗi : Không tìm thấy file");
        }
        return listNumber;
    }

    //Viết file sang 1 file khác
    public void writeFile(String filePath, int max){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Gía trị lớn nhất trong mảng là : " + max);
            bw.close();
        }catch (IOException i){
           i.printStackTrace();
        }
    }
}
