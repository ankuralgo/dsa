package recursion;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madoam";
        boolean result = solve(str, 0, str.length()-1);
        System.out.println(result);

    }


    public static boolean solve(String str, int left, int right){

        boolean result = true;
        if(left >= right){
            result= str.toCharArray()[left] == str.toCharArray()[right];
            return result;
        }

        return result && solve(str, left+1, right-1);
    }
}
