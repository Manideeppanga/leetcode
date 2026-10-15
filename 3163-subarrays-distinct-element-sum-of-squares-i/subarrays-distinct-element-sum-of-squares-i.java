class Solution {
    public int sumCounts(List<Integer> nums) {
        int i = 0, j = 0;
        int n = nums.size();
        int ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(j < n){
            hs.add(nums.get(j));
            j++;
            int c = hs.size();
            ans += c * c;
            if(j == n){
                i++;
                j = i;
                hs.clear();
            }
        }
        return ans;
    }
}