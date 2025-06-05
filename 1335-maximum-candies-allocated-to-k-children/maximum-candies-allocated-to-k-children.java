class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=1,high=getMax(candies);
        int max_candies=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(sum(mid,candies)>=k){
                  max_candies=mid;
                  low=mid+1;
            }
            else
            high=mid-1;

        }
        return max_candies;
    }
    int getMax(int[] candies){
        int sum=0;
        for(int i=0;i<candies.length;i++){
        if(sum<candies[i]){
            sum=candies[i];
        }
        }
        return sum;
    }
    long sum(int mid,int[] candies){
        long count=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=mid){
                count+=candies[i]/mid;
            }
        }
        return count;
    }
}