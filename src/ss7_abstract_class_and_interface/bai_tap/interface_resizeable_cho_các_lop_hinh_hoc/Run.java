package ss7_abstract_class_and_interface.bai_tap.interface_resizeable_cho_các_lop_hinh_hoc;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;
import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;



public class Run {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(1.4 , "Red" , true);
        resizeables[1] = new Square(4.5);
        resizeables[2] = new Rectangle(3.5, 6.0, "Red",true);

        System.out.println("Before change");
        for(Resizeable resizeable : resizeables){
            System.out.println(resizeable);
        }

        System.out.println("-----------------------------");
        System.out.println("After change");
        for(Resizeable resizeable : resizeables){
            // đoạn này chwua xong
            resizeable.resize(Math.random()*100);
            System.out.println(resizeable);
        }
    }
}
