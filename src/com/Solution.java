package com;

/**
 *
 *
 *  X+Y+Z = 100
 *  X+10Y+50Z = 500
 *
 */


public class Solution {

    public static void main(String[] args) {
        generateResult();
    }
    static int  sum = 500;
    public static boolean matches(int x, int y, int z) {

        if ((x+y+z)==100) {
            return sum == x + (10 * y) + (z * 50);
        }
       return false;
    }

    public static void generateResult(){

        for (int z=0; z<= 10; z++){
            int maxy = (500-(z*50))/10;
            for (int y =0; y<= maxy; y++){
//                int x = (500-(z*50)-(y*10));
                int x = 100-y-z; 
                boolean result = matches(x,y,z);
                if (result){
                    System.out.println("X= "+x+ " Y="+ y+ " Z= "+z);
                    return;
                }
            }
        }


    }



}
