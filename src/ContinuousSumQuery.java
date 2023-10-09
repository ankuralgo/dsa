import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContinuousSumQuery {

    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> beggar = new ArrayList<>(Collections.nCopies(A, 0));
        for (List<Integer> devotee: B){
            for (int i=devotee.get(0)-1; i< devotee.get(1); i++){
                beggar.set(i, beggar.get(i)+devotee.get(2));
            }
        }

        beggar.forEach(System.out::println);
    return beggar;
    }

    public static void main(String[] args) {
// [[1,2,10],[2,3,20],[2,5,25]]
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        array.add(new ArrayList<>(Arrays.asList(1, 2, 10)));
        array.add(new ArrayList<>(Arrays.asList(2,3,20)));
        array.add(new ArrayList<>(Arrays.asList(2,5,25)));
        solve(5, array);
    }
}
