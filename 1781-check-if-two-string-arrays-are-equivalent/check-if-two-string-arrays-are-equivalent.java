class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s=String.join("",word1);
        String s1=String.join("",word2);
        if(s.equals(s1)){
            return true;
        }
        return false;
    }
}