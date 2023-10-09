package string;

public class LongestPalindrome {


    public static void main(String[] args) {

        longestPalindrome2();
    }

        private static void longestPalindrome2() {
            String input = "1234554321";
            int maxOccurrence = 0;
            for (int i=0; i< input.length()-1; i++){
                int j =checkPalindrome(input, i);
                maxOccurrence  = Math.max(maxOccurrence, j);
            }
            System.out.println(maxOccurrence);
        }

    private static void longestPalindrome1() {

        String input = "1234554321";
        int maxOccurrence = 0;
        for (int i=0; i< input.length(); i++){
            for (int j =i+1; j< input.length(); j++) {
                if (isPalindrome(input, i, j))
                    maxOccurrence  = Math.max(maxOccurrence, j-i+1);
            }
        }
        System.out.println(maxOccurrence);
    }


    public static int checkPalindrome(String input, int idx){
        char [] characters = input.toCharArray();
        int result =0;
        int start =idx-1;
        if (characters[idx]==characters[idx+1]){
            start= idx;
        }
        int end = idx+1;
        while (start>=0 && end < input.length()){
            if (characters[start] == characters[end]){
                result=end-start+1;
                start--;
                end++;

            }else{
                break;
            }

        }
        return result;
    }


    public static boolean isPalindrome(String str, int start, int end){
        char [] characters = str.toCharArray();
        while (start <= end){
            if (characters[start] != characters[end]){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
