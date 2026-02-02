// Last updated: 2/2/2026, 3:00:05 PM
import java.util.Arrays;

class Solution {
    // LeetCode driver expects this exact method signature
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int sumSmallest = 0;
        int sumLargest = 0;

        // sum of k smallest
        for (int i = 0; i < k; i++) {
            sumSmallest += nums[i];
        }

        // sum of k largest
        for (int i = n - k; i < n; i++) {
            sumLargest += nums[i];
        }

        return Math.abs(sumLargest - sumSmallest);
    }
}