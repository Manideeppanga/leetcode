class Solution {
    public int minimumDeletions(int[] nums) {
        int[][] help = new int[nums.length][2];
        for(int i = 0;i < nums.length;i++){
            help[i][0] = nums[i];
            help[i][1] = i;
        }
        Arrays.sort(help,(a,b) -> Integer.compare(a[0] , b[0]));
        int minIdx = help[0][1];
        int maxIdx = help[nums.length - 1][1];
        
        int front = Math.max(maxIdx,minIdx) + 1;
        int back = nums.length - Math.min(maxIdx,minIdx);
        int minF = minIdx + 1 + (nums.length - maxIdx);
        int maxF = maxIdx + 1 + (nums.length - minIdx);
        int s1 = Math.min(front,back);
        int s2 = Math.min(minF,maxF);
        return Math.min(s1,s2);
    }
}