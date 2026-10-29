class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(i <= j){
            int width = j - i;
            int ht = Math.min(height[i],height[j]);
            int area = ht * width;
            max = Math.max(area,max);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}