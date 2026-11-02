class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1) return 0;
        int mid = -1;
        Arrays.sort(nums);
        mid = nums[nums.length / 2];
        int ans = 0;
        for(int i : nums){
            ans += Math.abs(mid - i);
        }
        return ans;
    }
}