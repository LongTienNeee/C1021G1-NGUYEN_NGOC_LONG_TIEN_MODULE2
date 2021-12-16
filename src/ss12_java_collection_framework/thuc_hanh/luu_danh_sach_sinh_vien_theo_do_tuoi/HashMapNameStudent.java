package ss12_java_collection_framework.thuc_hanh.luu_danh_sach_sinh_vien_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapNameStudent {
    public static void main(String[] args) {
        Map<String , Integer> hashMapStudent = new HashMap<>();
        hashMapStudent.put("Dương" , 19);
        hashMapStudent.put("Anh" , 20);
        hashMapStudent.put("Công", 18);
        hashMapStudent.put("Tuấn", 24);
        hashMapStudent.put("Bình" , 19);

        System.out.println("Display hashmap : ");
        System.out.println(hashMapStudent);

        Map<String , Integer> treeMapStudent = new TreeMap<>(hashMapStudent);
        treeMapStudent.put("Nghĩa", 25);
        System.out.println("-------------");
        System.out.println("Display key max to min : ");
        System.out.println(treeMapStudent);

        Map<String , Integer> linkedMapStudent = new LinkedHashMap<>(16, 0.75f, true);
            linkedMapStudent.put("Minh", 23);
            linkedMapStudent.put("Ý" , 15);
            linkedMapStudent.put("Vũ", 20);
            linkedMapStudent.put("Khiêm" , 21);
            System.out.println("-------------");
            System.out.println("LinkedHashMap : ");
            System.out.println("Age of Minh is " + linkedMapStudent.get("Minh"));

        Map<String , Integer> linkedMapStudent2 = new LinkedHashMap<>(treeMapStudent);
            linkedMapStudent2.put("Nghĩa" , 23);
        System.out.println("-------------");
            System.out.println("Age of Nghĩa is " + linkedMapStudent2.get("Nghĩa") );
    }
}
