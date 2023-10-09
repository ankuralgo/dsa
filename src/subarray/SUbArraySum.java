package subarray;

public class SUbArraySum {


    public static void main(String[] args) {

        int[] A = new int[]{2, 9, 5};
        System.out.println(subarraySum(A));
    }

    public static long subarraySum(int[] A) {
        long total = 0;
        int[] p = new int[A.length];
        p[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            p[i] = p[i - 1] + A[i];
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int sum = 0;
                if (i < 1) {
                    sum = p[j];
                } else {
                    sum = p[j] - p[i - 1];
                }
                total += sum;
            }
        }
        return total;
    }
}
