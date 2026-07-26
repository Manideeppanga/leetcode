class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
            int i = nums.length-1;
            int product = nums[i]*nums[i-1]*nums[i-2];
            int productNeg = nums[0]*nums[1]*nums[i];
        return Math.max(product,productNeg);
    }
}