class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
         int low=1,high=getMax(quantities);
        while(low<=high){
            int mid=(low+high)/2;
            if(calculation(mid,quantities)>n){
                 low=mid+1;
            }
            else
            high=mid-1;
        }
        return low;

    }
    int calculation(int mid,int[] quantities)
    {
        int count=0;
        for(int i=0;i<quantities.length;i++)
        {
            count+=(quantities[i]+mid-1)/mid;
        }
        return count;
    }
    int getMax(int[] quantities){
        int max=0;
        for(int i=0;i<quantities.length;i++){
            if(max<quantities[i]){
                max=quantities[i];
            }
        }
        return max;
        
    }
}