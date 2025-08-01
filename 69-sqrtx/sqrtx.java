class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int low=1,high=x/2;
        int ans=0;
        while(low<=high){
           int mid=(low+high)/2;
           long val=(long)mid*mid;
            if(val==x){
                return mid;
            }
                else if(val<x){
                  ans=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        
          return  ans;
    }
 
}