package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Map<String, Integer> index = new HashMap<>();

        char[] chars = s.toCharArray();

        int start = 0;
        int i=0;
        int max =0;
        for (char c: chars){

            if (index.containsKey(""+c)){
                int start1 = index.get(""+c)+1;
                if (start1 > start)
                    start=start1;
            }
                index.put(""+c,i);
            i++;
            max = Math.max(max, i-start);
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
