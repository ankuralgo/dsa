package sorting;

import java.util.Arrays;

/**
 * Problem Description
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 * <p>
 * <p>
 * Problem Constraints
 * -1010 <= A[i], B[i] <= 1010
 * <p>
 * <p>
 * Input Format
 * First Argument is a 1-D array representing  A.
 * Second Argument is also a 1-D array representing B.
 * <p>
 * <p>
 * Output Format
 * Return a 1-D vector which you got after merging A and B.
 */
public class MergeTwoSortedArrays {


    public static void main(String[] args) {

        int[] arr1 = {-4, -3,0};
        int[] arr2 = {2};
        int[] arr3 = solve(arr1, arr2);
        Arrays.stream(arr3).forEach(System.out::println);

    }

    public static int[] solve(final int[] A, final int[] B) {

        int l = A.length + B.length;
        int[] arr = new int[l];
        int p1 = 0, p2 = 0, n = 0;
        while (p1 < A.length && p2 < B.length) {
            if (A[p1] > B[p2]) {
                arr[n++] = B[p2++];
            } else {
                arr[n++] = A[p1++];
            }
        }
        while (p1 < A.length) {
            arr[n++] = A[p1++];
        }

        while (p2 < B.length) {
            arr[n++] = B[p2++];
        }
        return arr;
    }
}
