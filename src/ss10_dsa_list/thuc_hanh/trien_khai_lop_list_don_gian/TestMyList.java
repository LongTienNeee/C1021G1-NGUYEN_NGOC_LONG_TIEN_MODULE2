package ss10_dsa_list.thuc_hanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;

public class TestMyList {
    public static void main(String[] args) {
    MyList<Integer> listInteger  = new MyList<>();
    listInteger.add(4);
    listInteger.add(5);
    listInteger.add(6);
    listInteger.add(7);

    System.out.println(listInteger.get(2));

    listInteger.add(10);
    System.out.println(listInteger.get(4));

    //error
    System.out.println(listInteger.get(-1));

    }
}
