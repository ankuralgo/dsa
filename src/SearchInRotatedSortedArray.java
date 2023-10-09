public class SearchInRotatedSortedArray {

    public static int searchPivot(int[] nums) {
// int[] arr = {5, 6, 0, 1, 2, 3, 4};
        int result = -1;
        int l = 0, r = nums.length - 1;
        while (true) {
            if (r < l)
                return -1;
            if (r == l)
                return l;
            int mid = (l + r) / 2;

            if (mid < r && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > l && nums[mid] < nums[mid - 1])
                return (mid - 1);
            if (nums[l] > nums[mid]) {
                r = mid - 1;
            } else if (nums[mid] > nums[r]) {
                l = mid + 1;
            }
        }
    }



    static int binarySearch(int[] nums, int l, int r, int el){

        int result=0;





        return result;
    }

    static int findPivot(int arr[], int low, int high) {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 0, 1, 2, 3, 4};
        System.out.println(searchPivot(arr));
//        int idx = findPivot(arr, 0, arr.length - 1);
//        System.out.println(idx);
    }


}
