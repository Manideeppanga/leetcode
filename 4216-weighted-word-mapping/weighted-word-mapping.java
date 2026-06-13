class Solution {
    public static char sumWord(String s,int[] weights){
        int sum = 0;
        for(int i = 0;i < s.length();i++){
            sum += weights[s.charAt(i) - 'a'];
        }
        int idx = sum % 26;
        char ch = (char)('z' - idx);
        return ch;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < words.length;i++){
            String word = words[i];
           sb.append(sumWord(word,weights));
        }
        return sb.toString();
    }
}