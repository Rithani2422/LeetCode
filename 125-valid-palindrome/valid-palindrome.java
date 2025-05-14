class Solution {
    public boolean isPalindrome(String s) {
         char[] arr=s.toCharArray();
        List<Character> a=new ArrayList<>();
        List<Character> b=new ArrayList<>();
        for(char c:arr){
        if(Character.isLetterOrDigit(c)){
            a.add(Character.toLowerCase(c));
            b.add(Character.toLowerCase(c));

        }
        }
        int start=0;
        int end=a.size()-1;
        check(a,start,end);
        return a.equals(b);
    }
        
    
     public void check(List<Character> a,int start,int end){
            if(start>=end){
               return;
                }
        
        char temp=a.get(start);
        a.set(start,a.get(end));
        a.set(end,temp);
        check(a,start+1,end-1);
}

    }
