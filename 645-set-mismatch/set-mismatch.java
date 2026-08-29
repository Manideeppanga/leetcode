class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                ans[0] = entry.getKey();
                break;
            }
        }
        int n = nums.length;
        int actual = (n * (n + 1)) / 2;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i : nums){
           if(set.add(i)){
            sum += i;
           }
        }
        ans[1] = actual - sum;
        return ans;
    }
}