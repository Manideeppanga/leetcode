class Solution {
    public int maximumLengthSubstring(String s) {
     int len = 0;
     int i = 0,j = 0;
     HashMap<Character, Integer> map = new HashMap<>();

     for(j = 0;j < s.length();j++){
        map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0) + 1);
        while(map.get(s.charAt(j)) > 2){
            map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
            if(map.get(s.charAt(i)) == 0){
                map.remove(s.charAt(i));
            }
                i++;
        }
        len = Math.max(len,j - i + 1);
     }  
     return len;
    }
}