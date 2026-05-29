class Solution {
    public int numberOfSpecialChars(String word) {
        int[] upperF = new int[27];
        int[] lowerF = new int[27];
        int count = 0;
        for(int i = 0;i < word.length();i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
            lowerF[ch - 'a']++;
            }
            else{
                upperF[ch - 'A']++;
            }
        }
        for(int i = 0;i < 27;i++){
            if(upperF[i] != 0 && lowerF[i] != 0){
                count++;
            }
        }
        return count;
    }
}