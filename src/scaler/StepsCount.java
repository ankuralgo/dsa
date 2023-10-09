package scaler;

public class StepsCount {


    public static void main(String[] args) {
        System.out.println(stepsCount(3));
        System.out.println(stepsCount(5));
        System.out.println(stepsCount(6));
    }


    public static int stepsCount(int n){
        if (n==0){
            return 0;
        }
        else if (n ==1){
            return 1;
        } else if (n == 2){
            return 2;
        } else {
            return stepsCount(n-1)+stepsCount(n-2);
        }
    }


}
