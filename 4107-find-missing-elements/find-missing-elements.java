class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
            set.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = min;i <= max;i++){
            if(!set.contains(i))
             res.add(i);
        }
        return res;
    }
}