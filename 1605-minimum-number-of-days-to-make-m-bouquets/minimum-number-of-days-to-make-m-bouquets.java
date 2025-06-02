class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int min=0,max=0,ans=0;
         int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
         if ((long)m * k > bloomDay.length) return -1; 
    
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)>=m){
                 ans=mid;
                 high=mid-1;
            }
            else{
                low=mid+1;
          }
        }
        return low;
          }
          int possible(int[] arr,int day,int m,int k){
            int count=0;
            int noOfB=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=day){
                    count++;
                }
                else{
                    noOfB+=(count/k);
                    count=0;
                }
            }
            noOfB+=(count/k);
            return noOfB;
          }
}