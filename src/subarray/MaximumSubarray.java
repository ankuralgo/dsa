package subarray;

public class MaximumSubarray
{

    public static void main(String[] args) {
        int[] A = new int[]{15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};
//        System.out.println(solve(A, 6));
//
//        A= new int[]{ 18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
//        System.out.println(solve(A,1));

        A= new int[]{ 9, 5, 7, 8, 10, 1, 8, 3, 2 };
        System.out.println(maxSubarray(76, A));
    }

    public static int maxSubarray(int B, int[] A) {

        int avg = 0;
        int idx = 0;
        int[] p = new int[A.length];
        p[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            p[i] = p[i - 1] + A[i];
        }
        for (int j =0; j <A.length ; j++){
            for (int i = j; i < A.length ; i++) {
                int sum = 0;
                if (i == j){
                    sum = A[i];
                }else{
                    sum = p[i] - p[j];
                }
                if (sum <= B &&  avg  <  sum){
                    avg = sum;
                }
            }
        }
        return avg;
    }

}
