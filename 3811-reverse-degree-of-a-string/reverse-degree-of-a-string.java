class Solution {
    public int reverseDegree(String s) {
        int deg = 0;
        for(int i = 0;i < s.length();i++){
            int freq = Math.abs(s.charAt(i) - 123);
            deg += freq * (i + 1);
        }
        return deg;
    }
}