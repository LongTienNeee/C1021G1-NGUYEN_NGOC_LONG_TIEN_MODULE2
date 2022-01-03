package ss17_io_binary_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_STUDENT = "C:\\codeGym\\module2\\src\\ss17_io_binary_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan\\student";
    public static final String FILE_DEST = "C:\\codeGym\\module2\\src\\ss17_io_binary_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan\\dest";

    public static void writeToString(String filePath, List<Student> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFormFile(String filePath){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream oos = new ObjectInputStream(fis);
            students = (List<Student>) oos.readObject();
            oos.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Long Tiên" , "Đà Nẵng"));
        studentList.add(new Student(2, "Thành Long" , "Đà Nẵng"));
        studentList.add(new Student(3, "Duy Tuân" , "Hội An"));
        studentList.add(new Student(4, "Bích Ngọc" , "Huế"));

        writeToString(FILE_DEST, studentList);
        List<Student> studentsData = readDataFormFile(FILE_STUDENT);
        for(Student student : studentsData){
            System.out.println(student);
        }

    }



}
