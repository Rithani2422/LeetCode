class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0)return t.charAt(0);

        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(list.contains(c)){
                list.remove((Character)c);
            }
            else return c;
         }
         return 't';
    }
}