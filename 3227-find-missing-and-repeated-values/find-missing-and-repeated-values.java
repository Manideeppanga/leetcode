class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int ld = (int)Math.pow(n,2);
        int total = (ld * (ld + 1)) / 2;
        int[] ans = {-1,-1};
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        int tsum = 0;
        for(int i = 0;i < n * n;i++){
            int row = i / n;
            int col = i % n;
            hs.add(grid[row][col]);
            tsum += grid[row][col];
        }
        for(int i : hs){
            sum += i;
        }
        ans[0] = Math.abs(tsum - sum);
        ans[1] = Math.abs(total - sum);

        return ans;
    }
}