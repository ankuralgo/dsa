package prefixarraysum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWhichSumsToZero {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,-6,5,-5};
        int[] arr = {1,2,3,-3,-2,5,-5,};
        int pfarr[]= prefixArraySum(arr);

        int maxLen=0;
        Map<Integer, Integer> startPosition = new HashMap<>();
        startPosition.put(0,-1);
        for (int i=0; i< arr.length; i++){
            if(!startPosition.containsKey(pfarr[i])){
                startPosition.put(pfarr[i], i);
            }else{
            maxLen =Math.max(maxLen, i-startPosition.get(pfarr[i]));
            }
        }

        System.out.println(maxLen);

    }

    public static int[] prefixArraySum(int[] arr){

        int[] result = new int[arr.length];

        int sum =0;
        for (int i=0; i< arr.length;i++){
            sum=sum+arr[i];
            result[i]=sum;
            System.out.println(sum);
        }

        return result;
    }
}
