package scaler;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.setAll;


// Time complexity is O(nloglogn)
public class PrimeNumbersInRange {

    public static void main(String[] args) {
        findPrimeNumbersInGivenRange(12);
    }
    public static void findPrimeNumbersInGivenRange(int n){


        boolean [] prime= new boolean[n];
       Arrays.fill(prime,true);
       prime[0]=true;
        prime[1]=true;

       for (int i=2; i< Math.sqrt(n); i++){

           if (prime[i]) {
               for (int j = i * i; j < n; j += i) {

                   prime[j]= false;
               }
           }

        }

        int [] pNumbers = new int[n];
        int j =0;
        for (int i=0; i< n; i++){
            if (prime[i]){
                System.out.println(i);
                pNumbers[j++]= i;
            }
        }

        System.out.println("****************************************");
        System.out.println("****************************************");

        // Adding additional code for below code:
        /**
         * A lucky number is a number that has exactly 2 distinct prime divisors.
         *
         * You are given a number A, and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).
         * Between [1, 12] there are 3 lucky number: 6, 10 and 12.
         */

        int result []= new int[n];
        int idx=0;
        int c=0;
        for (int ii=2; ii< n; ii++){
            int count =0;
            int num=ii;
            int z=0;
            for (int kk =2; kk<= ii;kk++){
                int k = pNumbers[kk];
                if (num % k == 0){
                    num = num/k;
                    z++;
                }if (z==2 && num==1){
                    result[idx++]=ii;
                    c++;
                }
            }
        }

for (int i: result){
    System.out.println(i);
}
    }
}
