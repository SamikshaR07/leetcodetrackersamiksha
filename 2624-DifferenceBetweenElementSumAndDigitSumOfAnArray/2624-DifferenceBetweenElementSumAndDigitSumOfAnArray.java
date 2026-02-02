// Last updated: 2/2/2026, 3:08:40 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0, digit=0;
        for(int num:nums){
            sum+= num;
            while(num != 0){
                digit+= num%10;
                num/= 10;
            }
        }
        return Math.abs(sum-digit);
    }
}