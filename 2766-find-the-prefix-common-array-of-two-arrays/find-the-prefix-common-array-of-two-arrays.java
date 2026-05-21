class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int[] freq = new int[A.length + 1];
        int common = 0;
        for(int i = 0;i < A.length;i++){
            freq[A[i]]++;
            freq[B[i]]++;
            if(A[i] == B[i]){
                common++;
            }
            else{
            if(freq[A[i]] == 2){
                common++;
            }
            if(freq[B[i]] == 2){
                common++;
            }
            }
            ans[i] = common;
        }
        return ans;
    }
}