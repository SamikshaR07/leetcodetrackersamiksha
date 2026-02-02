// Last updated: 2/2/2026, 3:09:43 PM
class Solution {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}