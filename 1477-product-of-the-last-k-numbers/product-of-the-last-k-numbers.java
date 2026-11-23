class ProductOfNumbers {
    ArrayList<Integer> lst;

    public ProductOfNumbers() {
        lst = new ArrayList<>();

    }
    
    public void add(int num) {
        lst.add(num);
    }
    
    public int getProduct(int k) {
        int pro = 1;
        int n = lst.size() - 1;
        while(k > 0){
            pro *= lst.get(n);
            n--;
            k--;
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */