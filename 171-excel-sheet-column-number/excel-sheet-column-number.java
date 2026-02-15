class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();
        int p = 0;
        for(int i = n-1;i>=0;i--){
            ans += (columnTitle.charAt(i) - 64) * (int)Math.pow(26,p);
            p++;
        }
        return ans;
    }
}