package subarray;

public class AvgSubArray {


    public static void main(String[] args) {
        int[] A = new int[]{15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};
//        System.out.println(solve(A, 6));
//
//        A= new int[]{ 18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
//        System.out.println(solve(A,1));

        A= new int[]{ 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        System.out.println(solve(A,9));
    }

    public static int solve(int[] A, int B) {

        float avg = Integer.MAX_VALUE;
        int idx = 0;
        int[] p = new int[A.length];
        p[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            p[i] = p[i - 1] + A[i];
        }

        for (int i = 0; i <= A.length - B; i++) {
            float sum = 0;
            if (B == 1) {
                sum = A[i];
            } else if (i ==0){
                sum = (p[i + B - 1]) ;
            }else {
                sum = (p[i + B - 1] - p[i-1]) ;
            }
            sum = sum/B;
            System.out.println(sum + "---" + i);
            if (sum < avg) {
                avg = sum;
                idx = i;
            }
        }
        return idx;
    }
}
