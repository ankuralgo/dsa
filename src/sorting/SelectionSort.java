package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {3,2,1,4,5};
        solve(arr);
    }

    public static void solve(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    minIdx = j;
                    min=arr[j];
                }
            }
             arr[minIdx] = arr[i];
            arr[i] = min;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }


}
