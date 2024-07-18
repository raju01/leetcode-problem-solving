class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        // taking 2 variable to apply sliding window approch here 
        int i=0,j=0,max=0;
        while(i<len && j<len){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
                max=Math.max(max,i-j);
            }else{
                set.remove(s.charAt(j));
                j++;
            }

        }
        return max;
    }
}