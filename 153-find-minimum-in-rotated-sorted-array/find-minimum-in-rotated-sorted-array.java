class Solution {
    public int findMin(int[] nums) {
        int st = 0;
        int ed = nums.length - 1;
        int min =Integer.MAX_VALUE;
        while(st <= ed){
            int mid = (st + ed)/2;
            if(nums[st] <= nums[mid]){
                min = Math.min(min,nums[st]);
                st = mid + 1;
            }
            else{
                min = Math.min(nums[mid],min);
                ed = mid - 1;
            }
        }
        return min;
    }
}