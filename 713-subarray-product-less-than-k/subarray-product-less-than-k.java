class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
         int n = nums.length;
        int l = 0,r = 0;
        int count = 0;
        long pro = 1;
        while(r < n){
            pro *= nums[r];
            r++;
            while(pro >= k && l < n){
                pro /= nums[l];
                l++;
            }
               count += r - l;
        }
        return count;
    }
}