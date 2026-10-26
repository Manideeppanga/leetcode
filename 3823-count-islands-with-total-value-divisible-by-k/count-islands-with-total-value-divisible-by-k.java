class Solution {
    public long dfs(int i,int j,int[][] grid,boolean[][] visited,long sum){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == 0){
            return 0;
        }
        visited[i][j] = true;
        sum = grid[i][j];
        sum += dfs(i + 1,j,grid,visited,0);
        sum += dfs(i - 1,j,grid,visited,0);
        sum += dfs(i,j + 1,grid,visited,0);
        sum += dfs(i,j - 1,grid,visited,0);

        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] != 0 && !visited[i][j]){
                    long sum = dfs(i,j,grid,visited,0);
                    if(sum % k == 0){
                        count++;
                    }

                }
            }
        }
        return count;
}
}