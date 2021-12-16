package ss12_java_collection_framework.thuc_hanh.phan_biet_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMapAndHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Tiên", 19 , "Đà Nẵng");
        Student student2 = new Student("Vinh", 20 , "Hồ Chí Minh");
        Student student3 = new Student("Tùng" , 25, "Hà Nội");
        Student student4 = new Student("Ngọc" , 30 , "Hồ Chí Minh");
        Student student5 = new Student("Ngân" , 23 , "Vinh");

        Map<Integer, Student> hashMapStudent = new HashMap<>();
            hashMapStudent.put(1, student1);
            hashMapStudent.put(2, student2);
            hashMapStudent.put(3, student3);
            hashMapStudent.put(4, student4);
            hashMapStudent.put(5, student5);

        System.out.println("Display of HashMap");
            for(Map.Entry<Integer, Student> studentEntry : hashMapStudent.entrySet()){
                System.out.println(studentEntry.toString());
            }

        Set<Student> hashSetStudents = new HashSet<>();
            hashSetStudents.add(student1);
            hashSetStudents.add(student2);
            hashSetStudents.add(student3);
            hashSetStudents.add(student4);
        System.out.println();
        System.out.println("----------HashSet");
            for(Student student : hashSetStudents){
                System.out.println(student.toString());
            }

        System.out.println();
        System.out.println("Differents");
        System.out.println("HashMap : sắp xếp theo thứ tự của age bé đến lớn");
        System.out.println("HashSet : sắp xếp theo address giống nhau");
    }
}
