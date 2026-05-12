class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0;i < r;i++){
            if(bs(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
    public boolean bs(int[] mat,int target){
        int l = 0;
        int h = mat.length - 1;
        while(l <= h){
            int mid = (l + h)/2;
            if(mat[mid] == target){
                return true;
            }
            if(mat[mid] < target){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return false;
    }
}