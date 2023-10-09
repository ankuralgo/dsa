package sorting;

import java.util.stream.Stream;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr ={6,5,3,2,1};
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("--");
        printArray(arr);

    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void mergeSort(int[] arr, int star, int end){

        if (star==end) return;

        int mid = (star+end)/2;
        mergeSort(arr,star, mid);
        mergeSort(arr,mid+1, end);
        merge(arr, star, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end ){

         int i=0,j=0;
         int leftLen=mid-start+1;
         int rightLen=end-mid;

         int[] leftArr =new int[leftLen];
        int[] rightArr =new int[rightLen];

        for (int ii=0; ii< leftLen; ii++){
            leftArr[ii]= arr[start+ii];
        }

        for (int ii=0; ii< rightLen; ii++){
            rightArr[ii]= arr[mid+ii+1];
        }

        int k = start;
        while (i<leftLen && j< rightLen){

            if(leftArr[i] < rightArr[j]){
                    arr[k] = leftArr[i];
                    i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i< leftLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j< rightLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


    public void swap(int[] arr, int i, int j){

        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=i;

    }

}
