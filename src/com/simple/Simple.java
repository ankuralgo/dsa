package com.simple;

import java.util.ArrayList;
import java.util.List;

public class Simple {


    /**
     * You are climbing a staircase. It takes n steps to reach the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     *
     *
     * Example 1:
     *
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     *
     * Example 2:
     *
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     */


    /**
     *
     *  5
     *  1,1,1,1,1
     *  1,1,1,2
     *  1,1,2,1
     *  1,2,1,1
     *  2,1,1,1
     *  2,2,1
     *  2,1,2
     *  1,2,2
     */


    public static void main(String[] args) {

        int input =4;
        System.out.println(climb(4));
        System.out.println(climb(5));
        System.out.println(climb(7));
        series(4);

    }

    // 1 1 2 3 5 8
    private static void series (int n) {

        int j =2;
        int k =1;
        System.out.println(j);
        for (int i=1; i< n-1;i++){
            int t = j+k;
            System.out.println(j+k);
            k =j;
            j = t;

    }



    }

    private static int climbWithFor(int input){

        int result =0;
        for (int i= input ; i>0; i--) {
            if (input < 1) {
                result += result;
            }
            if (input == 1) {
                result +=1;
            } else if (input == 2) {
                result +=2;
            } else {
                return climb(input - 1) + climb(input - 2);
            }
        }
        return result;
    }


    private static int climb(int input){

        if (input < 1 ){
            return 0;
        }
        if (input == 1){
            return 1;
        }
        else if (input == 2){
            return 2;
        }  else {
            return climb(input-1)+climb(input-2);
        }
    }



}
