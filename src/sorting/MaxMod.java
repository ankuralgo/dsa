package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMod {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(999,998,998,999));

        int solve = solve(arr);
        System.out.println(solve);
     }
         public static int solve(ArrayList<Integer> A) {
            Collections.sort(A);

            for (int i= A.size()-1 ; i>1; i--){
                if (A.get(i-1).intValue() != A.get(i).intValue()){
                    return A.get(i-1);
                }
            }
            return 0;
        }


}
