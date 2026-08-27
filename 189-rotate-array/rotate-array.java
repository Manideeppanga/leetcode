class Solution {
    public void reverse(int[] n,int st,int ed){
        while(st <= ed){
            int temp = n[st];
            n[st] = n[ed];
            n[ed] = temp;
            st++;
            ed--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k - 1);
        reverse(nums,k,nums.length - 1);
    }
}