class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(nums[i] < 0){
                nums[i] = Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);
        int[] ar = new int[n];
        int i = 0;
        int j = n - 1;
        int idx = 0;
        while(i <= j){
            if(i == j){
                ar[idx++] = nums[i];
                i++;
                j--;
            }
            else{
                ar[idx++] = nums[j--];
                ar[idx++] = nums[i++];
            }
        }
        long ans = 0;
        for(int l = 0;l < ar.length;l++){
            if(l % 2 == 0){
                ans += ar[l] * ar[l];
            }
            else{
                ans -= ar[l] * ar[l];
            }
        }
        return ans;
    }
}