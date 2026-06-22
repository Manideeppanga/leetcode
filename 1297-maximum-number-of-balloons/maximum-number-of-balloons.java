class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i = 0;i < text.length();i++){
            freq[text.charAt(i) - 'a']++;
        }
        freq[11] = freq[11] / 2;
        freq['o' - 'a'] = freq['o' - 'a'] / 2;
        int count = Integer.MAX_VALUE;
        for(int i = 0;i < freq.length;i++){
            if(i == 0 || i == 1|| i == 11 || i == 14 ||i == 13){
                count = Math.min(count,freq[i]);
            }
        }
        return count;
    }
}