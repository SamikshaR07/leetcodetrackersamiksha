// Last updated: 2/2/2026, 3:09:21 PM
class Solution {
    public int arrangeCoins(int n) {
        int block=0;
        for(int i=0;i<=n;i++) {
            block = i;
            n=n-block;
        }
        return block;
    }
}