class Solution {
    public void sortColors(int[] nums) {
       int st = 0;
       int mid = 0;
       int ed = nums.length - 1;
       while(st <= ed && mid <= ed){
        if(nums[mid] == 0 ){
            int temp = nums[mid];
            nums[mid] = nums[st];
            nums[st] = temp;
            st++;
            mid++;
        }
        else if(nums[mid] == 2){
             int temp = nums[mid];
            nums[mid] = nums[ed];
            nums[ed] = temp;
            ed--;
        }
        else {
            mid++;
        }
       }
    }
}