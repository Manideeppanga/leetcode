class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // int temp[] =new int[2];
        // for(int i = 0;i<n-1;i++){
        //     for(int j= i+1;j<n;j++){
        //         if(nums[i]+nums[j] == target){
        //              temp[0] = i;
        //              temp[1] =j;
        //         }
        //     }
        // }
        // return temp;
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            int rem = target - nums[i];
            if(mp.containsKey(rem)){
                return new int[]{mp.get(rem),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}