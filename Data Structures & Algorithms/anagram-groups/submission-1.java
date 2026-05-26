class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            int count[]=new int [26];
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int num:count){
                key.append(num).append("*");
            }
            String finalData=key.toString();
            map.putIfAbsent(finalData, new ArrayList<>());
            map.get(finalData).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
