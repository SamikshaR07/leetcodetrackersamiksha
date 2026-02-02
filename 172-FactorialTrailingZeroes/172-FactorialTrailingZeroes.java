// Last updated: 2/2/2026, 3:09:42 PM
class Solution {
    public int trailingZeroes(int n) {
        int r = 0;
        while(n>0) {
            n/=5;
            r+=n;
        }
        return r;
    }
}