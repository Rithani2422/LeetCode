class Solution {
    public String reverseWords(String s) {
         String[] c=s.strip().split("\\s+");
         for(int i=0;i<c.length;i++)
         {
           char[] a=c[i].toCharArray();
            int j=0; 
            int k=a.length-1;
            while(j<=k)
            {
                char temp=a[j];
                a[j]=a[k];
                a[k]=temp;
                j++;
                k--;
            }
            
            c[i]=String.valueOf(a);
         }

        return String.join(" ",c);
    }
}