class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] res = new int[grid.length][grid[0].length];
        int len = grid.length * grid[0].length;
        for(int i = 0;i < len;i++){
            int val = grid[i / grid[0].length][i % grid[0].length];
            int newIdx = (i + k) % len;
            int row = newIdx / grid[0].length;
            int col = newIdx % grid[0].length;
            res[row][col] = val;
        }
        for(int i = 0;i < grid.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j < grid[0].length;j++){
                temp.add(res[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}