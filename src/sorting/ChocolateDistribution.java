package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ChocolateDistribution {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,4,1,9,56,7,9,12));
        System.out.println(solve(arr, 5));
    }
    public static int solve(ArrayList<Integer> A, int B) {

        Collections.sort(A);

        int diff = Integer.MAX_VALUE;
        for (int i=0; i< A.size()-B; i++){
            int end = i+B-1;
            int ii = A.get(end);
            int jj = A.get(i);
            int myDiff= A.get(end)-A.get(i);
            diff = Math.min(diff, myDiff);
        }
        return diff;
    }
}
