// Last updated: 2/2/2026, 3:09:53 PM
class Solution {
    public boolean isPalindrome(int x) {
     if(x<0) return false;
     int rev=0; 
     int org=x;
     while(x!=0) {
        rev=rev*10 + x%10;
        x/=10;
      }
      return org==rev?true:false;
    }
}