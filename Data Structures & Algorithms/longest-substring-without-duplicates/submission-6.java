class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        Set<Character>set=new HashSet<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
