package twoPointer;

public class TrappingRainWater {
    public static int solution(int[] inputs) {
        int lMax = inputs[0], left = 0;
        int rMax = inputs[inputs.length - 1], right = inputs.length - 1;
        int water = 0;
        while (left < right) {
            if (lMax < rMax) {
                left++;
                if (lMax < inputs[left]) {
                    lMax = inputs[left];
                } else {
                    water += lMax - inputs[left];
                }
            } else {
                right--;
                if (rMax < inputs[right]) {
                    rMax = inputs[right];
                } else {
                    water += rMax - inputs[right];
                }
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solution(input));
    }


}
