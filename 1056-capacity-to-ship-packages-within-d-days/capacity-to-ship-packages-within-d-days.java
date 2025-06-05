class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low=getMax(weights),high=getSum(weights); 
       while(low<=high){
        int mid=(low+high)/2;
        int noOfDays=days(weights,mid);
        if(noOfDays<=days){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        
       }
        return low;
    }
       int getMax(int[] weights){
        int max=0;
        
        for(int i=0;i<weights.length;i++){
        
            if(max<weights[i]){
                max=weights[i];
                 }
        }
        
        return max;
    }
     int getSum(int[] weights){
        int sum=0;
        
        for(int i=0;i<weights.length;i++){
        
            sum+=weights[i];
                 }
        
        
        return sum;
    }
     int days(int[] weight,int cap){
        int day=1,load=0;
        for(int i=0;i<weight.length;i++){
            if(load+weight[i]>cap){
                day=day+1;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }
        return day;
     }

    
}