class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[][] temp = new int[arr.length][2];
        for(int i = 0;i < arr.length;i++){
            temp[i][0] = i;
            temp[i][1] = arr[i];
        }
        Arrays.sort(temp, Comparator.comparing(o -> o[1]));
        int rank = 1;
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0 ;i < temp.length;i++){
            if(!hp.containsKey(temp[i][1]))
            hp.put(temp[i][1],rank++);
        }
        for(int i = 0;i < arr.length;i++){
            arr[i] = hp.get(arr[i]);
        }
        return arr;
    }
}