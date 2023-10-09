import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NobleInteger implements Comparable{


    public static int solve(List<Integer> A) {

        Collections.sort(A);
        int size = A.size();
        for(int i = 0; i < size; i++){
            while(i+1<size && A.get(i)==A.get(i+1))
                i++;
            if(A.get(i) == size-1-i)
                return 1;
        }


        return -1;
    }

    public static void main(String[] args) {

//        int[] A= {3, 2, 1, 3};
        int[] A= {3, 2, 1, 3};

        List<Integer> al = Arrays.stream(A).boxed().collect(Collectors.toList());
        int a= solve(al);
        System.out.println(a);



        String s ="the sky is blue";

        StringBuilder result =new StringBuilder();
        String[] str = s.split(" ");

        for (int i =str.length-1; i>=0 ; i--){
            if ((i == 0 || i == str.length-1 ) && str[i] ==""){
                continue;
            }else if (i ==0 ){
                result.append(str[i]);
            }else{
                result.append(str[i]).append(" ");
            }
        }
        System.out.println(result.toString());

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
