class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            // if(mp.containsKey(nums[i])){
            //     mp.put(nums[i],mp.get(nums[i])+ 1);
            // }
            // else{
            //     mp.put(nums[i],1);
            // }
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        int k = nums.length / 3;
        for(int i : mp.keySet()){
            if(mp.get(i) > k){
                ans.add(i);
            }
        }
        return ans;
    }
}