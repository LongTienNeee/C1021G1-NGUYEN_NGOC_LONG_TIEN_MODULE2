package ss7_abstract_class_and_interface.thuc_hanh.comparable_de_so_sanh_cac_lop_hinh_hoc;

import org.jetbrains.annotations.NotNull;
import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2){
        if(c1.getRadius() > c2.getRadius()){
            return 1;
        } else if(c1.getRadius() < c2.getRadius()){
            return -1;
        } else {
            return 0;
        }
    }


}
