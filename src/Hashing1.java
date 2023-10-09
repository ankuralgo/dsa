import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashing1 {

    public static  int solve(ArrayList<Integer> A) {

        HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> myset = new HashSet<>(A);

        for (int i=0; i< A.size()-1; i++){
            map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
        }

        for (int i=0; i< A.size()-1; i++){

            if (map.get(A.get(i)) > 1){
                return A.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(){
            {
                //10, 5, 3, 4, 3, 5, 6
                add(10);
                add(5);
                add(3);
                add(4);
                add(3);
                add(5);
                add(6);
            }
        };
        System.out.println(solve(A));
    }
}
