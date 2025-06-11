class Solution {
    public boolean isSubsequence(String s, String t) {
    //     List<Character> list=new ArrayList<>();
    //     for(int i=0;i<t.length();i++){
    //         list.add(t.charAt(i));
    //     }
    //     for(int i=0;i<s.length();i++){
    //     if(!(list.contains(s.charAt(i)))){
    //         return false;
    //     }
    //     }
    //   return true;
    int i=0,j=0;
    while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length(); 
    
    }
}