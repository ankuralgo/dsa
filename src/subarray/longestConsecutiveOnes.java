package subarray;

public class longestConsecutiveOnes {
    public static void main(String[] args) {
//        System.out.println(solve("111011101"));
//        System.out.println(solve("010100110101"));
//        System.out.println(solve("100001011"));
//        System.out.println(solve("110011"));
//        System.out.println(solve("11100"));
//        System.out.println(solve("110100"));
        System.out.println(solve("110011"));



    }

    public static int solve(String A) {

        char[] X = A.toCharArray();
        int[][] r = new int[X.length][2];
        int result =0;
        int max1 = 0;
        int max1idx = 0;
        int maxresult = 0;
        int length = 0;
        int ri = 0;
        int cp = -1;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == '1') {
                if (cp == -1){
                    cp = i;
                }
                length++;
            }
            if ((X[i] == '0' && length > 0) || (cp != -1 && i == X.length -1)) {
                r[ri][0] = cp;
                r[ri][1] = length;
                if (max1 < length) {
                    max1 = length;
                    max1idx = ri;
                }
                ri++;
                length = 0;
                cp =-1;
            }

        }
        if (ri == 1) {
            return r[0][1];
        }
        if (ri >1){
             for (int i=0; i< ri-1 ;i++){
                 result = 0;
              if (r[i][0]+r[i][1]+1 == r[i+1][0]){
                  if (r.length >2){
                      result = r[i][1] + r[i + 1][1] + 1;
                  }else{
                      result = r[i][1] + r[i + 1][1] ;
                  }
              }else{
                  result = r[i][1];
              }
                 if (maxresult < result){
                     maxresult = result;
                 }
             }
        }
        return maxresult;
    }
}
