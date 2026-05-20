class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(0,candidates,ans,temp,target);
        return ans;
    }
    public void backtrack(int idx,int[] can,List<List<Integer>> ans,List<Integer> temp,int target){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx;i < can.length;i++){
            if(can[i] > target){
                continue;
            }
            temp.add(can[i]);
            backtrack(i,can,ans,temp,target - can[i]);
            temp.remove(temp.size() - 1);
        }
    }
}