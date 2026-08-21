class Solution {
    public int countNegatives(int[][] grid) {
        int size = grid.length * grid[0].length;
        int count = 0;
        for(int i = 0;i < size;i++){
            int row = i / grid[0].length;
            int col = i % grid[0].length;
            if(grid[row][col] < 0){
                count++;
            }
        }
        return count;
    }
}