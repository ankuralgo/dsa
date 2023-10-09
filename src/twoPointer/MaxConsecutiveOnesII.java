package twoPointer;

public class MaxConsecutiveOnesII {


    public static void main(String[] args) {
        int[] arr= {1,0,1,0,0,1,0,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr,2));
    }

        /**
         * @param nums: a list of integer
         * @return: return a integer, denote  the maximum number of consecutive 1s
         */

        public static int findMaxConsecutiveOnes(int[] nums, int n) {

            int max=0;
            int j=0;
            for (int i=0; i< nums.length; i++){
                if (nums[i]==0){
                    if (n<1){
                        max= Math.max(max, i-j);
                        i = i+n;
                        n++;
                    }else{
                        if (n<1){
                            j++;
                        }
                        n--;
                    }
                }
            }

            return Math.max(max, nums.length-1-j);
        }
        public static int findMaxConsecutiveOnes(int[] nums) {

            int max=0, curr=0, flip=1;

            for (int i=0; i< nums.length; i++){

                if (nums[i]==0){
                    if(flip==1){
                        flip--;
                        curr++;
                    }else{
                        flip=1;
                        max=Math.max(curr, max);
                        curr=0;
                    }
                }else{
                    curr++;
                }
            }
            return Math.max(curr, max);
        }
    }

