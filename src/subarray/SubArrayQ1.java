package subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubArrayQ1 {
    static int count = 0;

    private static ArrayList<Integer> reverse(ArrayList<Integer> arr, int startIdx, int endIdx) {
        System.out.println(startIdx + "--" + endIdx + "--" + "--");
        for (int i = startIdx, j = endIdx; i <= j; j--, i++) {
            int tmp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, tmp);
        }
        return arr;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(64, 78, 50, 25, 24, 27, 76, 59, 65, 41, 37, 6, 80, 61, 8, 48, 38, 85, 41, 18, 12, 81, 36, 37, 12, 44, 22, 65, 12, 33, 19, 42, 25, 30, 5, 4, 96, 81, 72, 71, 20, 20, 23, 85, 93, 33, 32, 30, 12, 97, 24, 13, 93, 58, 74, 37, 10, 46, 26, 21, 41, 92, 90, 21, 65, 35, 89, 26, 10, 14, 64, 28, 3, 80, 99, 62, 38, 55, 8, 92, 31, 93, 58, 77, 21, 34, 57, 49, 82, 85, 38, 89, 66, 51, 4, 31, 12, 33, 83, 29));
        int input = arr.size();
//        for (int i = 1; i <= input; i++) {
//            arr.add(sc.nextInt());
//        }
        int rotations = 13;//sc.nextInt();
        rotations = rotations % arr.size();
        System.out.println("----" + rotations);
        ArrayList<Integer> rr = reverse(arr, 0, input - rotations - 1);
        rr = reverse(arr, input - rotations, input - 1);
        rr = reverse(arr, 0, input - 1);
        rr.forEach(aa -> System.out.print(aa + " "));

    }
}