package subarray;

public class carry_forward {

    public static void main(String[] args) {
        int[] A = new int[]{5, 2, 3, 7, 4, 7, 5, 2};
        System.out.println(solve1(A));
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int length = A.length, result = length;

        if (length == 1) {
            return 1;
        }

        int min = A[0], max = A[0];
        int min_index = -1, max_index = -1;

        for (int i = 0; i < length; i++) {
            if (A[i] < min) {
                min = A[i];
            } else if (A[i] > max) {
                max = A[i];
            }
        }

        if (min == max) {
            return 1;
        }

        for (int i = 0; i < length; i++) {
            if (A[i] == min) {
                min_index = i;
            }
            if (A[i] == max) {
                max_index = i;
            }
            if (max_index != -1 && min_index != -1) {
                int len = length;
                if (max_index > min_index) {
                    len = max_index - min_index + 1;
                } else {
                    len = min_index - max_index + 1;
                }
                result = result < len ? result : len;
            }
        }
        return result;
    }


    public static int solve1(int[] A) {
        int length = A.length, result = length;

        if (length == 1) {
            return 1;
        }

        int min = A[0], max = A[0];
        int min_index = -1, max_index = -1;

        for (int i = 0; i < length; i++) {
            if (A[i] < min) {
                min = A[i];
            } else if (A[i] > max) {
                max = A[i];
            }
        }

        if (min == max) {
            return 1;
        }

        for (int i = 0; i < length; i++) {
            if (A[i] == max) {
                max_index = i;
                if (min_index != -1) {
                    result = Math.min(result, max_index - min_index + 1);
                }
            } else if (A[i] == min) {
                min_index = i;
                if (max_index != -1) {
                    result = Math.min(result, min_index - max_index + 1);
                }
            }
        }
        return result;
    }
}


