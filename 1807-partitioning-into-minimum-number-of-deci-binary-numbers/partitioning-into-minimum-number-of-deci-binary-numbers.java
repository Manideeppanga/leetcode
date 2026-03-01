class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0;i < n.length();i++){
            int num = n.charAt(i) - '0';
            maxDigit = Math.max(num,maxDigit);
        }
        return maxDigit;
    }
}