class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int ld = (int)Math.pow(n,2);
        int total = (ld * (ld + 1)) / 2;
        int[] ans = {-1,-1};
        int sum = 0;
        int[] ar = new int[n * n];
        for(int i = 0;i < n*n;i++){
            int row = i / n;
            int col = i % n;
            ar[i] = grid[row][col];
            sum += ar[i];
        }
        Arrays.sort(ar);
        for(int i = 1;i < n * n;i++){
            if(ar[i] == ar[i - 1]){
                ans[0] = ar[i];
                break;
            }
        }
        
        ans[1] = Math.abs(total - (sum - ans[0]));
        return ans;
    }
}