package com.lineaje;

public class Lineaje {


    static int [][][] magicSquares;
    static {
        magicSquares = generateAllMS();
    }
    public static void main(String[] args)
    {
        int[][] input = { { 8, 5, 6 }, { 3, 8, 7 },
                { 4, 9, 2 } };
        System.out.println(findMinimumCost(input));
    }

    public static int[][][] generateAllMS(){
        int[][][] ms = {
                { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
                { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
                { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
                { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
                { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
                { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
                { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
                { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
        };

        return ms;
    }
    public static int findMinimumCost(int[][] arr)
    {
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int diff = findMinimumFromMS(arr, magicSquares[i]);
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static int findMinimumFromMS(int[][] arr,
                                        int[][] ms)
    {

        int diff = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                diff += Math.abs(arr[i][j] - ms[i][j]);
            }
        }
        return diff;
    }

}
