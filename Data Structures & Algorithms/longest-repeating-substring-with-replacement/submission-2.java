class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        int i=0,j=0,max=0,count=0;
        while(j<s.length()){
            arr[s.charAt(j)-'A']++;
            max=Math.max(max,arr[s.charAt(j)-'A']);
            while((j-i+1)-max>k){
                arr[s.charAt(i)-'A']--;
                i++;
            }
            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}
