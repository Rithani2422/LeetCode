class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] ch=s.toCharArray();
        int low=0,high=ch.length-1;
        for(int i=0;i<ch.length;i++){
            while(!(list.contains(ch[low]))&&low<high){
                low++;
            }
            while(!(list.contains(ch[high]))&&low<high){
                high--;
            }
            if(low<high){
                char temp=ch[low];
                ch[low]=ch[high];
                ch[high]=temp;
                low++;
                high--;
            }

        }
        s=String.valueOf(ch);
        return s;
    }
}