// Last updated: 2/2/2026, 3:09:20 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int distance=0;
        while(x!=0 || y!=0)
        {
            if((x & (1)) != (y & (1)))
            {
                distance++;
            }
            x=x>>1;
            y=y>>1;
        }
        return distance;   
    }
}
