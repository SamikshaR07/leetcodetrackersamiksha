// Last updated: 2/2/2026, 3:08:33 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return ((arrivalTime + delayedTime) % 24);
    }
}
