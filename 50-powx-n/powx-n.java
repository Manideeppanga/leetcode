class Solution {
    public double recursion(double x,long N){
        if(N == 0){
            return 1;
        }
        double temp = recursion(x, N / 2);
        if(N % 2 == 0){
            return temp * temp;
        }
        
        return x * temp * temp;
    }
    public double myPow(double x, int n) {
      long N = Math.abs((long) n);
      double ans = recursion(x,N);
      return n < 0 ? 1/ans : ans;
    }
}