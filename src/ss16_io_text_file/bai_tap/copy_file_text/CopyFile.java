//package ss16_io_text_file.bai_tap.copy_file_text;
//
//import java.io.*;
//
//public class CopyFile {
//    public void readFile(String filePath) throws IOException {
//        try{
//        File file = new File(filePath);
//
//        if(!file.exists()) {
//            throw new FileNotFoundException();
//        }
//
//            FileReader fileReader = new FileReader(file);
//            BufferedReader br = new BufferedReader(fileReader);
//            String line = "";
//            while ((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//            br.close();
//
//        } catch (IOException e){
//            System.err.println("Lỗi : File không tồn tại");
//        }
//    }
//
//    public void writeFile(String filePath){
//        FileWriter fileWriter = new FileWriter(filePath);
//        fileWriter.write();
//
//    }
//}
