class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // int startRow = x;
        // int endRow = x + k - 1;
        // int startCol = y;
        // int endCol = y + k - 1;
        // for(int i = startRow;i <= endRow;i++){
        //     for(int j = startCol;j <= endCol;j++){
        //         int temp = grid[i][j];
        //         grid[i][j] = grid[endRow][j];
        //         grid[endRow][j] = temp;
        //     }
        //     endRow--;
        // }
    int i = x;
    int j = x + k - 1;
    int stCol = y;
    int edCol = y + k - 1;
    while(i < j){
    for(int l = stCol;l <= edCol;l++){
        int temp = grid[i][l];
        grid[i][l] = grid[j][l];
        grid[j][l] = temp;
    }
    i++;
    j--;
    }
        return grid;
    }
}