package sorting;

import java.util.Arrays;

public class MergeSort1 {


    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);


    }


    public static void mergeSort(int[] arr, int start, int end) {

        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {

        int l = end - start + 1;
        int ii=0;
        int[] newArr = new int[l];

        int p1 = start;
        int p2 = mid+1;

        while (p1 <= mid && p2 <= end) {
            if (arr[p1] > arr[p2]) {
                newArr[ii++] = arr[p2];
                p2++;
            } else {
                newArr[ii++] = arr[p1];
                p1++;
            }
        }

        while (p1 <= mid) {
            newArr[ii++] = arr[p1++];
        }
        while (p2 <= end) {
            newArr[ii++] = arr[p2++];
        }

        for (int i=start, j=0;i<= end;i++){
            arr[start++]=newArr[j++];
        }

    }

}
