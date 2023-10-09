package string;

import java.util.HashMap;
import java.util.Map;

public class PalindromeCombination {

    public static void main(String[] args) {
        System.out.println(solve("abcde"));
        System.out.println(solve("abbaee"));
    }

    public static int solve(String A) {

        char[] chars = A.toCharArray();

        HashMap<String, Integer> pair = new HashMap<>();

        for (char c: chars){
            pair.computeIfPresent(String.valueOf(c),(key, val) -> (val + 1)%2);
            pair.computeIfAbsent(String.valueOf(c),k -> 1);

        }

        int i=0;

        for (Map.Entry<String, Integer> entry : pair.entrySet()){

            if (entry.getValue() == 1){
                i++;
            }
        };
        if (i==1 || i == 0){
            return 1;
        }else {
            return 0;
        }

    }
}
