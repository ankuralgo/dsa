package subarray;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithDistinctElements {


    public static void main(String[] args) {

        int[] myarr = {0,1,1,3,4,5,6,7};
        int k = 5;

        Map<Integer, Integer> myHashMap = new HashMap<>();

        for (int i=0; i< k; i ++) {
            myHashMap.computeIfPresent(myarr[i], (key, val) -> (val + 1));
            myHashMap.computeIfAbsent(myarr[i], v -> 1);
        }
        System.out.println(myHashMap.size());

        int i =0;
        int j = myarr.length;
        while(i<j-k){
            int incomingElement = myarr[i+k];
            int outGoingElement = myarr[i];

            myHashMap.computeIfPresent(incomingElement, (key, val) -> (val + 1));
            myHashMap.computeIfAbsent(incomingElement, v -> 1);

            int val = myHashMap.get(outGoingElement);
            if (val ==1){
                myHashMap.remove(outGoingElement);
            }else{
                myHashMap.put(outGoingElement, val-1);
            }
            i++;

            System.out.println(myHashMap.size());
        }


    }

}
