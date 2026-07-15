class Solution {
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int evenS = 0;
        int oddS = 0;
        int num = 1;
        int temp = n * 2;
        while(temp > 0){
            if(num % 2 == 0){
                evenS += num;
                num++;
            }
            else{
                oddS += num;
                num++;
            }
            temp--;
        }
      return  gcd(evenS,oddS);
    }
}