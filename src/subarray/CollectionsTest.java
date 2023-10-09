package subarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Handler;

public class CollectionsTest {


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        System.out.println(a.size());
        a.add(1);
        System.out.println(a.size());
        System.out.println(a.size());

        List<Integer> t = Collections.unmodifiableList(a);
//        HashMap
//        Object


    }
}
