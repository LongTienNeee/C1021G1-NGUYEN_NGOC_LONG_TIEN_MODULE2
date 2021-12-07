package ss5_access_modifier_static_method_static_property.thuc_hanh.static_method;

public class TestMethod {
        public static void main(String[] args){
            Student student1 = new Student(1, "Tiên");
            Student student2 = new Student(2, "My");
            Student student3 = new Student(3, "LongTiên");
            Student.change();

            student1.display();
            student2.display();
            student3.display();
        }

}
