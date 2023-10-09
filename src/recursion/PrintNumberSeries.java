package recursion;

public class PrintNumberSeries {


    public static void main(String[] args) {

        printNN(6);


    }



    public static int   printN(int i){
        if (i == 0) {
            return i;
        }
        int s = printN(i-1)+1;
        System.out.println(s);
        return s;
    }

    public static void   printNN(int i){
        if (i == 0) {
           return;
        }
        System.out.println(i);
         printNN(i-1);


    }
}
