class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        long low=1,high=num;
        while(low<=high){
            long mid=(low+high)/2;
            long value=mid*mid;
            if(value==num){
                return true;
            }
            else if(value<num){
                low=mid+1;
            }
            else
            high=mid-1;
        }
       return false; 
    }
}