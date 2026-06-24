class Solution {
    int r,c;
    public int numIslands(char[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int islands = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(grid[i][j] == '1'){
                    islands++;
                dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    void dfs(char[][] grid,int i,int j){
        if(i >= r|| j >= c|| i < 0|| j < 0|| grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
    }
}