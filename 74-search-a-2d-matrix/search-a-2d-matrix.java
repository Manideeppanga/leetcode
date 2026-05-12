class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int st = 0;
        int ed = r * c - 1;
        while(st <= ed){
            int mid = (st + ed) / 2;
            int row = mid / c;
            int col = mid % c;
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] < target){
                st = mid + 1;
            }
            else{
                ed = mid - 1;
            }
        }
        return false;
    }
}