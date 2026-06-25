class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i < n;i++){
             int n1 = 0,n2 = 0;
            for(int j = i;j < n;j++){
                if(nums[j] == target){
                    n1++;
                } else{
                    n2++;
                }
                if(n1 > n2){
                    count++;
                }
                }
            }
        return count;
    }
}