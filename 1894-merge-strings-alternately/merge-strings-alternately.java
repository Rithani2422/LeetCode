class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] c=word1.toCharArray();
        char[] c1=word2.toCharArray();
        String val="";
        int i=0,j=0;
        while(i<c.length&&j<c1.length){
            val=val+c[i];
            val=val+c1[j];
            i++;
            j++;
        }
    
        if(c.length>c1.length){
            String sub=word1.substring(i,c.length);
            val=val+sub;
            
        }
         if(c.length<c1.length){
            String sub=word2.substring(j,c1.length);
            val=val+sub;
            
        }

        return val;
    }
}