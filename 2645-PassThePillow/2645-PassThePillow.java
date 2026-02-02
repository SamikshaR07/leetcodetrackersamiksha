// Last updated: 2/2/2026, 3:08:37 PM
class Solution {
    public int passThePillow(int n, int time) {

        // Approach 1
        int dir = 1;
        int pillowPos = 0;

        for (int i = 0; i < time; i++) {
            pillowPos += dir;

            if (pillowPos == n - 1 || pillowPos == 0) {
                dir = -dir;
            }
        }

        return pillowPos + 1;

    }
}