package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem Description
 * Given an array A of non-negative integers, arrange them such that they form the largest number.
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * Problem Constraints
 * 1 <= len(A) <= 100000
 * 0 <= A[i] <= 2*109
 * Input Format
 * The first argument is an array of integers.
 * Output Format
 * Return a string representing the largest number.
 * <p>
 * Example Input
 * Input 1:
 * A = [3, 30, 34, 5, 9]
 * Input 2:
 * <p>
 * A = [2, 3, 9, 0]
 * <p>
 * Example Output
 * Output 1:
 * "9534330"
 * Output 2:
 * "9320"
 */
public class LargestNumber {

    public static void main(String[] args) {

//        List<Integer> arr = Arrays.asList(9, 99, 9900, 98, 97);
//        List<Integer> arr = Arrays.asList(8, 89);
        List<Integer> arr = Arrays.asList(3,30,34,5,9);

        Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1 +"-"+o2);
                int min = 0;
                int max = 0;
                if (o1 == o2) {
                    return 0;
                } else if (o1 < o2) {
                    min = o1;
                    max = o2;
                } else {
                    min = o2;
                    max = o1;
                }

                int minT = Math.max(0, (int) (Math.log10(min)));
                int maxT = Math.max(0, (int) (Math.log10(max)));

                while (minT >= 0) {
                    int i = 0;
                    int j = 0;
                    if (minT > 0) {
                        i = (min / ((int) (Math.pow(10, minT))));
                        min = min - (i * ((int) (Math.pow(10, minT))));
                    } else {
                        i = min;
                    }
                    minT--;

                    if (maxT > 0) {
                        j = (max / ((int) (Math.pow(10, maxT))));
                        max = max - (i * ((int) (Math.pow(10, maxT))));

                    } else {
                        i = max;
                    }
                    maxT--;
                    if (i > j) {
                        return -1;
                    } else if (i <j ) {
                        return 1;
                    }else{
                        j = (max / ((int) (Math.pow(10, maxT))));
                        return i >= j? -1: 1;
                    }
                }

                return 0;
            }

            public int firstDigit(int number) {
                int digits = Math.max(1, (int) (Math.log10(Math.abs(number))));
                return (int) (number / (int) (Math.pow(10, digits)));
            }
        };
        Collections.sort(arr, c);
        String collect = arr.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);
    }

}
