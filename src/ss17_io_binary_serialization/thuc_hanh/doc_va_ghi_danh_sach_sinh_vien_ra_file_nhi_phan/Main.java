//package ss17_io_binary_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;
//
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void writeToString(String path, List<Student> studentList) {
//        try {
//            FileOutputStream fos = new FileOutputStream(path);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(studentList);
//            oos.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(1, "Long Tiên" , "Đà Nẵng"));
//        studentList.add(new Student(2, "Thành Long" , "Đà Nẵng"));
//        studentList.add(new Student(3, "Duy Tuân" , "Hội An"));
//        studentList.add(new Student(4, "Bích Ngọc" , "Huế"));
//        writeToString();
//    }
//
//
//
//}
