package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args){
        Student student = new Student();

        System.out.println("Name before change : " + student.getName() );
        System.out.println("Classes before change : " + student.getClasses() );
        student.setName("Longtien");
        System.out.println("Name after change : " +  student.getName());
        student.setClasses("C0921G1");
        System.out.println("Classes after change : " +  student.getClasses());
    }
}
