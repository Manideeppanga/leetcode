class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int k = words.length - 1;k >= 0;k--){
            sb.append(words[k]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}