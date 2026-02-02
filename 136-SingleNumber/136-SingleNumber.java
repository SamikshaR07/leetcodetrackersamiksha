// Last updated: 2/2/2026, 3:09:45 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }
}