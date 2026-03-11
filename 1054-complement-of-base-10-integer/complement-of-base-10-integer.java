class Solution {
    public int bitwiseComplement(int n) {
        String bin = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < bin.length();i++){
            if(bin.charAt(i) == '1'){
                sb.append(0);
            }
            else{
                sb.append(1);
            }
        }
        int decimal = Integer.parseInt(sb.toString(),2);
        return decimal;
    }
}