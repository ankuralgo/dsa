package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RainWaterTrapped {



    public static int trap1(final List<Integer> A) {
        int result =0;
        int left = 0;
        int lmax =0, rmax =0;
        int right = A.size()-1;
        while (left <right){

            if (A.get(left) <= A.get(right)){
                if (lmax > A.get(left)){
                    result += lmax-A.get(left);
                }else{
                    lmax = A.get(left);
                }
                left++;
            }else{
                if (rmax > A.get(right)){
                    result += rmax-A.get(right);
                }else{
                    rmax = A.get(right);
                }
                right--;
            }
        }
        return result;
    }
    public static int trap(final List<Integer> A) {

        int result =0;
        int maxL = 0;
        int maxR = 0;
        List<Integer> left = new ArrayList<>(Collections.nCopies(A.size(), 0));
        List<Integer> right = new ArrayList<>(Collections.nCopies(A.size(), 0));

        int i=0;
        while ( i< A.size()){
            left.set(i, (maxL - A.get(i)));
            maxL = Math.max(maxL, A.get(i));
            i++;
        }

        i = A.size()-1;
        while ( i >= 0){
            right.set(i, (maxR - A.get(i)));
            maxR = Math.max(maxR, A.get(i));
            i--;
        }

        for (i=0; i< A.size(); i++){
            int m = Math.min(left.get(i), right.get(i));
            if (m >0){
                result += m;
            }
        }
        return result;
    }

    public static void main(String[] args) {
         List<Integer> input = new ArrayList<>();
        input =   Arrays.asList(1,0,2,5,1,0,3,0,0,7);
        System.out.println("Result : "+ trap(input));
        System.out.println("Result1 : "+ trap1(input));


        input =   Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1);
        System.out.println("Result : "+ trap(input));
        System.out.println("Result1 : "+ trap1(input));

        input =   Arrays.asList(4,2,0,3,2,5);
        System.out.println("Result : "+ trap(input));
        System.out.println("Result1 : "+ trap1(input));

    }
}
