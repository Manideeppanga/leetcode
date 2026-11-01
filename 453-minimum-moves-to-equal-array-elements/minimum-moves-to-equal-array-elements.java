class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            min = Math.min(nums[i],min);
        }
        for(int i : nums){
            moves += (i - min);
        }
        return moves;
    }
}