// Last updated: 2/2/2026, 2:59:53 PM
class Solution {
    public String winningPlayer(int x, int y) {
      int turn=1; //alice
      while(x>=1 && y>=4) {
        x-=1;
        y-=4;
        turn++;
      } 
      if(turn%2==0) return "Alice" ;
      else return "Bob";
    }
}