//package subarray;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AmazingSubArray{
//
//    public static void main(String[] args) {
//        System.out.println(solve("ACBC"));
//    }
//    public static int solve(String A) {
//        int length = A.length(), result_count = 0;
//
//        for (int i = 0; i < length; i++) {
//            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u'
//                    || A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U') {
//                result_count +=  (length - i);
//            }
//        }
//
//        List<Integer> result = new ArrayList<>();
//      int[] values = Ints.toArray(list);
//        return result_count ;
//    }
//}