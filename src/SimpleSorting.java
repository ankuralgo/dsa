import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleSorting {


    public static  List<Integer> sortColors(List<Integer> A) {
        for (int i=0; i< A.size(); i++){
            for (int j = i+1;j< A.size(); j++){
                if (A.get(i)> A.get(j)){
                    int t = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, t);
                }
            }
        }
        return A;
    }


    public static void main(String[] args) {


        int[] A= {3, 2, 1, 3};

        List<Integer> al = Arrays.stream(A).boxed().collect(Collectors.toList());
         sortColors(al).forEach(a -> {
             System.out.println(a);
         });



    }
}
