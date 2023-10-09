import java.util.Arrays;

public class SortColors {

    public static int[] sortColors(int[] A) {

        int zero = 0;
        int two = A.length - 1;

        for (int i = 0; i <= two;){
            if (A[i] == 0){
                int t = A[zero];
                A[zero] =0;
                A[i] = t;
                zero++;
                i++;
            }
            else if (A[i] == 2){
                int t = A[two];
                A[two] = 2;
                A[i] = t;
                two--;
            }else{
                i++;
            }
        }
        return A;
    }


    public static void main(String[] args) {
        int [] arrInput =  { 2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
                Arrays.stream(sortColors(arrInput)).forEach( System.out::print);
    }
}
