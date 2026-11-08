class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int n = arr1.length;
        int m = arr2.length;
        boolean[] taken = new boolean[n];
        for(int i = 0;i < n;i++){
            taken[i] = true;
            for(int j = 0;j < m;j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    taken[i] = false;
                }
            }
            if(taken[i]) count++;
        }
        return count;
    }
}