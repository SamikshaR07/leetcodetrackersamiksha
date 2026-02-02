// Last updated: 2/2/2026, 3:09:39 PM
class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = Integer.bitCount(n);
        return count;
    }
}