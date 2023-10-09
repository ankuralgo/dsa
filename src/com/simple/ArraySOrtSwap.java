package com.simple;

public class ArraySOrtSwap {

    public static void main(String[] args) {
//        int[] input = {1, 1,1,1, 2,2, 3 ,3 ,4 ,5};
                int[] input = {1, 2,3,4,5,6};
//        int[] input = {1, 1,1,1, 2,2,2,2,2, 3,3,3,3,3 ,3 ,4,4,4,4,4,4 ,5,5,5,5,5,5,7};
        //{1, 2,1,1, 1, 3 ,3 ,4 ,5}

        int swapPointer =1;
        int swapValue =input[0];

        for( int i =1; i < input.length ; i ++) {
        if(input[i] != swapValue ){
            swapValue = input[i];

            int j = input[swapPointer];
            input[swapPointer] = input[i];
            input[i] = j;

            int a = input[i];
            int b = input[swapPointer];
            swapPointer ++;
            }
        }

        for (int i=0; i< input.length; i ++){
            System.out.print(input[i] +" ");
        }

    }
}
