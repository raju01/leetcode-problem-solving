class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String acro = "";
        for(String word: words){
            acro=acro+word.charAt(0);
        }
        
         return acro.equals(s);
    }
   
}