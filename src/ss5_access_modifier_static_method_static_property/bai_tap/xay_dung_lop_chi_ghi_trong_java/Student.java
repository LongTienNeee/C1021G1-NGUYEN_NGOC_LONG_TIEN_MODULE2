package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name;
    private String classes;

    Student(){
        this.name = "John";
        this.classes = "C1021G1";
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String n){
         this.name = n;
    }

    public void setClasses(String c){
        this.classes = c;
    }
}
