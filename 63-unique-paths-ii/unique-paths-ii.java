class Solution {
    public int paths(int[][] dp,int m,int n,int[][] ob){
        dp[m - 1][n] = 1;
        for(int i = m - 1;i >= 0;i--){
            for(int j = n - 1;j >= 0;j--){
                if(ob[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
       return paths(dp,m,n,obstacleGrid);
    }
}