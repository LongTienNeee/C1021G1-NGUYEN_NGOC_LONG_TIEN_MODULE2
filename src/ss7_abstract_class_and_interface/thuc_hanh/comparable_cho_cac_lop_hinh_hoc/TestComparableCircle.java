package ss7_abstract_class_and_interface.thuc_hanh.comparable_cho_cac_lop_hinh_hoc;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(10.5);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(2.4 , "Black" , false);

        System.out.println("Pre-sorted:");
         for (ComparableCircle circle : circles){
             System.out.println(circle);
         }

       Arrays.sort(circles);

        System.out.println("-------------------------------");
        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }
    }

