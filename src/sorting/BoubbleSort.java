package sorting;

import java.util.Arrays;

public class BoubbleSort {


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        solve(arr);
    }

    public static void solve(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);

    }
}