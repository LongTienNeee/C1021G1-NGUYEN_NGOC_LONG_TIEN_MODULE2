package ss12_java_collection_framework.thuc_hanh.sap_xep_voi_conparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tiên" , 19 , "Đà Nẵng");
        Student student2 = new Student("Minh" , 23 , "Huế");
        Student student3 = new Student("Đức" , 30 , "Hải Phòng");
        Student student4 = new Student("Vũ" , 20 , "Đà Nẵng");

        System.out.println(student1.compareTo(student2));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students);
        for(Student student : students){
            System.out.println(student.toString());
        }

//        AgeComparator ageComparator = new AgeComparator();
//        Collections.sort(students,ageComparator);
//        System.out.println("So sánh theo tuổi");
//        for(Student st : students){
//            System.out.println(st.toString());
//        }
//


    }
}
