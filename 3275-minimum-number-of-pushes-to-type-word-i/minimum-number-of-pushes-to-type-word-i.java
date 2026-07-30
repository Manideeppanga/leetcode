class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n <= 8){
            return n;
        }
        int ans = 8;
        int rem = n - 8;
        int i = 2;
        while(rem > 0){
            if(rem > 8){
                int innerRem = rem - 8;
                ans += 8 * i;
                rem = innerRem;
                i++;
                continue;
            }
            ans += rem * i;
            rem = rem - 8;
            i++;
        }
        return ans;
    }
}