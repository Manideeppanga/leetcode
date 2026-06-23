class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean isNeg = false;
        if(x < 0){
            x = Math.abs(x);
            isNeg = true;
        }
        long reverse = 0;
        int lastDigit = 0;
        while(x > 0){
            lastDigit = x%10;
            x = x/10;
            reverse = reverse * 10 + lastDigit;
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
                return 0;
            }

        }
        if(isNeg == true){
         ans = (int)-reverse;
        }
        else {
            ans = (int)reverse;
        }
        return ans;
    }
}