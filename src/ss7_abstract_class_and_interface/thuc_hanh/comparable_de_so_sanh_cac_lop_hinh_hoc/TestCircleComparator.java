package ss7_abstract_class_and_interface.thuc_hanh.comparable_de_so_sanh_cac_lop_hinh_hoc;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class TestCircleComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.4 , "Red", false);
        circles[1] = new Circle();
        circles[2] = new Circle(10.2);

        System.out.println("Before sorted");
        for(Circle circle : circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("------------------------------------------");
        System.out.println("After sorted");
        for(Circle  circle : circles){
            System.out.println(circle);
        }
    }
}
