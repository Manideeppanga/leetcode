class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            // temp[i][0] = i;
            temp[i] = arr[i];
        }
        // Arrays.sort(temp, Comparator.comparing(o -> o[1]));
        Arrays.sort(temp);
        int rank = 1;
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0 ;i < temp.length;i++){
            if(!hp.containsKey(temp[i]))
            hp.put(temp[i],rank++);
        }
        for(int i = 0;i < arr.length;i++){
            arr[i] = hp.get(arr[i]);
        }
        return arr;
    }
}