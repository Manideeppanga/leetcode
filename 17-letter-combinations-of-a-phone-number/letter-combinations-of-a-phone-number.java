class Solution {
       static String[] options = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        static List<String> ans;
        static StringBuilder sb;
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        sb = new StringBuilder();
       helper(digits,0);
       return ans;
    }
    public static void helper(String digits,int i){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        for(char ch : options[digits.charAt(i) - '0'].toCharArray()){
            sb.append(ch);
            helper(digits,i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}