class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=getMax(nums);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumOfD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;            
        }
        }
        return low;
     }
    int sumOfD(int[] nums,int div){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=(int)Math.ceil((double)nums[i]/div);
        }
        return sum;
    }
    int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}