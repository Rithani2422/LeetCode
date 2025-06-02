class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=getMax(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int total=totalHours(piles,mid);
            if(total<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
        int getMax(int[] nums){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>sum){
                    sum=nums[i];
                }
            }
            return sum;
        }
        int totalHours(int[] nums,int hours){
            int total=0;
            for(int i=0;i<nums.length;i++){
                total+=Math.ceil((double)nums[i]/hours);
            }
            return total;
        }
    
}