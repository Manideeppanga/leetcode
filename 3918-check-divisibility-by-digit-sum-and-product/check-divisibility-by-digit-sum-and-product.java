class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        long product = 1;
        while(temp > 0){
            // int digit = temp % 10;
            sum += temp % 10;
            product *= temp % 10;
            temp = temp / 10;
        }
        return n % (sum + product) == 0;
    }
}