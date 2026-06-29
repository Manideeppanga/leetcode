class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int rse[] = new int[n];
        for(int i = n - 1;i >= 0;i--){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()) rse[i] = n;
            else rse[i] = s.peek();
            s.push(i);
        }
        s = new Stack<>();
        int lse[] = new int[n];
        for(int i = 0;i < n;i++){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()) lse[i] = -1;
            else lse[i] = s.peek();
            s.push(i);
        }
        int maxArea = 0;
        for(int i = 0;i < n;i++){
            int height = heights[i];
            int width = rse[i] - lse[i] - 1;
            int area = height * width;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}