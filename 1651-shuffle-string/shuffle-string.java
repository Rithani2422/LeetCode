class Solution {
    public String restoreString(String s, int[] indices) {
          char[] ch=new char[s.length()];
          for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);
          }
         s=String.valueOf(ch);
         return s;
    }
}