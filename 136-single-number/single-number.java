class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i, 0) + 1);
        }
        int ans = 0;

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                ans = entry.getKey();
                break;
            }

        }
        return ans;
    }
}