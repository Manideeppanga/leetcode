class Solution {
    public void findPerm(List<List<Integer>> ans, List<Integer> temp,boolean[] helper,int[] nums){
        if(temp.size() == helper.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if(!helper[i]){
                helper[i] = true;
                temp.add(nums[i]);
                findPerm(ans,temp,helper,nums);
                temp.remove(temp.size() - 1);
                helper[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] helper = new boolean[nums.length];
        findPerm(ans,temp,helper,nums);
        return ans;
    }
}