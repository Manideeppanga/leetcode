class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int n = r * c;
        int l = 0,h = n - 1;
        while(l <= h){
            int mid = (l + h) / 2;
            int row = mid / c;
            int col = mid % c;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}