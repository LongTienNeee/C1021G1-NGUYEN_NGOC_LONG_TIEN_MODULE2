package ss5_access_modifier_static_method_static_property.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String country = "VietNam";

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        country = "DaNang";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + country);
    }
}

