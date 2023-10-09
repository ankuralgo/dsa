package string;

import java.util.stream.Stream;

public class ReverseWords {


    public static void main(String[] args) {
        String input ="DSA is hard";
        int j =input.toCharArray().length-1;
        char[] reverseString = swap(input, 0, j);
        System.out.println(reverseString);

        int start =0; int end = 0;
        for(int i=0; i<=j ;i ++){

            if (reverseString[i] == ' '|| i ==j){
                if (i==j){
                    end++;

                }
                reverseString = swap(String.valueOf(reverseString), start, end);
                System.out.println(reverseString);
                start =i+1;
            }else{
                end =i;
            }

        }


    }

    private static char[] swap(String input , int i , int j){
        char[] inputChars = input.toCharArray();
        while (i<j){
            char tmp = inputChars[i];
            inputChars[i]=inputChars[j];
            inputChars[j]=tmp;
            i++; j--;
        }
        return  inputChars;
    }
}
