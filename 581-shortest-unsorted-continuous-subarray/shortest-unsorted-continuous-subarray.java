class Solution {
    public static  int findUnsortedSubarray(int[] nums) {
         if (nums == null || nums.length < 1) {
            return 0;
        }

        int n = nums.length;

        // four pointers:space complexity:O(1)
        int end = -1;
        int start = -1;

        int max = nums[0];
        int min = nums[n - 1];

        // 1 -loop 2-passes
        for (int i = 0; i < n; i++) {
            // left -right ; find right boundary(end)
            if (nums[i] < max) {
                end = i;
            } else {
                max = nums[i];
            }

            // right - left; find left boundary(start)
            int j = n - 1 - i;
            if (nums[j] > min) {
                start = j;
            } else {
                min = nums[j];
            }
        }
        // If Array is already sorted
        if (end == -1) {
            return 0;
        }

        return end - start + 1;
    }

    public static void main(String[] args) {
        // std test case
        int[] nums1 = { 2, 6, 4, 8, 10, 9, 15 };
        System.out.println("Nums1 output:" + findUnsortedSubarray(nums1));

        // Sorted array
        int[] nums2 = { 1, 2, 4, 6, 8, 10 };
        System.out.println("Nums2 Output:" + findUnsortedSubarray(nums2));

        // SIngle element
        int[] nums3 = { 7 };
        System.out.println("Nums3 output:" + findUnsortedSubarray(nums3));

        // duplicate element
        int[] nums4 = { 1, 2, 3, 2, 4, 3, 6 };
        System.out.println("Output nums4:" + findUnsortedSubarray(nums4));

    }
}