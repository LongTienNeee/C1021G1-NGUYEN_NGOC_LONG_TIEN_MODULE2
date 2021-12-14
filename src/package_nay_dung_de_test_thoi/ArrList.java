package package_nay_dung_de_test_thoi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("fish");
        animals.add("dog");
        animals.add("cat");
        animals.toArray();


        Object[] array = animals.toArray();
        System.out.println(Arrays.toString(array));
    }
}
