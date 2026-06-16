class Solution {
    public String simplifyPath(String path) {
        String[] words = path.split("/");
        Stack<String> stk = new Stack<>();
        for(String s : words){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            else if(s.equals("..") && !stk.isEmpty()){
                stk.pop();
                continue;
            }
            else if(s.equals("..") && stk.isEmpty()){
                continue;
            }
            stk.push(s);
        }
        StringBuilder sb = new StringBuilder();
        if(stk.isEmpty()){
            sb.append("/");
        }
        else{
        for(String s : stk){
            sb.append("/").append(s);
        }
        }
        return sb.toString();
    }
}