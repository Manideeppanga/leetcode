class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int small = 0;
        int pivotc = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < pivot){
                small++;
            }
            else if(nums[i] == pivot){
                pivotc++;
            }
        }
        int left = 0;
        int right = small+pivotc;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] < pivot){
                ans[left] = nums[i];
                left++;
            }
            else if(nums[i] > pivot){
                ans[right] = nums[i];
                right++;
            }
            else if(nums[i] == pivot){
                continue;
            }
        }
        for(int i = small;i < small + pivotc;i++){
            ans[i] = pivot;
        }
        return ans;
    }
}