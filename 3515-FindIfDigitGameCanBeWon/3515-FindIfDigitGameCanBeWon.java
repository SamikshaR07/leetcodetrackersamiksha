// Last updated: 2/2/2026, 3:00:04 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd = 0;
        int dd = 0;
        for(int x:nums) {
            if(x<10) sd+=x;
            else dd+=x;
        }
        return sd!=dd;
    }
}