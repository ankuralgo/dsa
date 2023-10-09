package scaler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColorfulNumbers {

    public static void main(String[] args) {
//        System.out.println(colorful1(236));
        colorful1(236);


     }

    public static void colorful1(int A) {
        ArrayList < Integer > numbers = new ArrayList< >();
        int b =10;
        int X=A;
        while (b<X) {
            A = X;
            while (A != 0) {
                int num = A % b;
                numbers.add(num);
                System.out.println(num);
                A /= b;
            }
            b=b*10;
        }
    }
    public static int colorful(int A) {
        HashSet < Integer > hashSet = new HashSet< >();
        ArrayList < Integer > numbers = new ArrayList< >();
        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }
        Collections.reverse(numbers);
        int n = numbers.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                System.out.println("----");
                for (int k = i; k <= j; k++) {
                    prod *= numbers.get(k);
                    System.out.println(prod);
                }
                if (hashSet.contains(prod))
                    return 0;
                hashSet.add(prod);
            }
        }
        return 1;
    }
}
