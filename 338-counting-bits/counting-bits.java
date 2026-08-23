class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            return new int[]{0};
        }
        if(n == 1){
            return new int[]{0,1};
        }
        if(n == 2){
            return new int[]{0,1,1};
        }
        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i = 2;i < ans.length;i++){
            int last = Integer.highestOneBit(i);
            if(last == i){
                ans[i] = 1;
            }
            ans[i] = ans[last] + ans[i - last];
        }
        return ans;
    }
}