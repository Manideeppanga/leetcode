class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0,down = 0, r = 0,l = 0;
        for(char c :moves.toCharArray()){
            if(c == 'U') up++;
            if(c == 'D') down++;
            if(c == 'R') r++;
            if(c == 'L') l++;
        }
        if(up == down && r == l){
            return true;
        }
        else{
            return false;
        }
    }
}