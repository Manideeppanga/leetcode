class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , Comparator.comparing(o -> o[1]));
        int count = 0;
        int endTime = intervals[0][1];
        for(int i = 1;i < intervals.length;i++){
            if(endTime <= intervals[i][0] ){
                endTime = intervals[i][1];
            }
            else {
                count++;
            }
        }
        return count;
    }
}