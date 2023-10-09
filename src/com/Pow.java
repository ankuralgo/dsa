package com;

public class Pow {

    public static void main(String[] args) {

        double r = 0;
//        r = myPow(4.70975,-6);
        r = myPow(2,17);
        r = myPow(2,4);
        r = myPow(2,5);
        r = myPow(2,19);
//        r = myPow(2,36);
//         r = myPow(2,4);
//        r = myPow(3,3);
//        r = myPow(3,10);

//        r = myPow(2,-4);

//        r = myPow(2,-50);
     }

    public static double myPow(double x, int n) {
        double y =x;
        if (x == 0 || x== 1){
            return x;
        }
        if (n==0){
            return 1;
        }
        double temp = 1;

        for (int i = Math.abs(n); i>0; i = i/2) {
            if (i % 2 != 0) {
                temp = temp * x;
            }              // 5 2 1
            x = x * x;  // temp :: 2 2  32            x:: 4 16 16*16
//            System.out.print("[temp= "+temp +", i= "+i +"], ");
        }
         if (n <0) {
             System.out.print("-->> " + temp);
              temp = 1 / temp;
             System.out.println("<<---->>" + temp);
          }
        System.out.println( "pow("+y+", "+n+") = "+ temp);
         if (temp != Math.pow(y,n)){
             System.out.println("Wrong answer. Correct answer is "+ Math.pow(x,n));
         }
        return temp;
    }



}
