class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int len = 0;
        int i = 0,j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(j = 0;j < nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j], 0 ) + 1);
            while(map.get(nums[j]) > k){
                map.put(nums[i],map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            len = Math.max(len,j - i + 1);
        }
        return len;
    }
}