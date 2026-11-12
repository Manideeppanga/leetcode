class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int lenf = 1,lend = 1,max = 1;
        for(int i = 1;i < n;i++){
            if(nums[i] > nums[i - 1]){
                lenf++;
                max = Math.max(max,lenf);
            }
            else{
                lenf = 1;
            }
        }
        for(int i = 1;i < n;i++){
            if(nums[i] < nums[i - 1]){
                lend++;
                max = Math.max(max,lend);
            }
            else{
                lend = 1;
            }
        }
            return max;
    }
}