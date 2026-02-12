class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m+n];
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merge[k++] = nums1[i++];
            }
            else{
                merge[k++] = nums2[j++];
            }
        }
        while(i < m){
            merge[k++] = nums1[i++];
        }
        while(j < n){
            merge[k++] = nums2[j++];
        }
        int len = m+n;
       if(len%2 == 0){
        return (merge[len/2 - 1] + merge[len/2])/2.0;
       }
       else{
        return merge[len/2];
       }
    }
}