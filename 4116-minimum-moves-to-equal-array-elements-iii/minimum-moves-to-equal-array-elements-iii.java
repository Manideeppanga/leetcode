class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< n;i++){
            max = Math.max(nums[i],max);
        }
        int steps = 0;
        for(int i : nums){
            steps += max - i;
        }
        return steps;
    }
}