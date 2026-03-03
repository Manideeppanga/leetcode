class Solution {
    public String writeBin(int n){
        if(n == 1) {
            return "0";
        }
        String prev = writeBin(n - 1);
        String revIn = revAndInvert(prev);
        return prev + "1" + revIn;

    }
    public String revAndInvert(String n){
        StringBuilder sb = new StringBuilder();
        for(int i = n.length() - 1;i >= 0;i--){
            if(n.charAt(i) == '0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        String bin = writeBin(n);
        return bin.charAt(k - 1);
    }
}