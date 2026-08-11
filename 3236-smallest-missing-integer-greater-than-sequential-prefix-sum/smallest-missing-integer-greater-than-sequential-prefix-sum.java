class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int prefix = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                prefix += nums[i];
            }
            else{
                break;
            }
        }
            while (set.contains(prefix)) {
               prefix++;
          }
          return prefix;
    }
}