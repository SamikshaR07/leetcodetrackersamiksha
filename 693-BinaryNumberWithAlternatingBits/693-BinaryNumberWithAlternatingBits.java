// Last updated: 2/2/2026, 3:09:15 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return (x & (x + 1)) == 0?true:false;

    }
}