class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
             int[] count = new int[26];
             for(char c:s.toCharArray()){
                count[c-'a']++;
             }
            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append(num).append("#");
            }
             String finalKey = key.toString();

            map.putIfAbsent(finalKey, new ArrayList<>());
            map.get(finalKey).add(s);
        }
         return new ArrayList<>(map.values());
    }
}
