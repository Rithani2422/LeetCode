class Solution {
    public int splitArray(int[] nums, int k) {
   
        // code here
        if(nums.length<k)return -1;
        int low=getMax(nums),high=getSum(nums);
        while(low<=high){
            int mid=(low+high)/2;
            if(book(nums,mid)>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;    
        
    }
   static int book(int[] arr,int pages){
        int stu=1,pagesStu=0;
        for(int i=0;i<arr.length;i++){
            if(pagesStu+arr[i]<=pages){
                pagesStu+=arr[i];
            }
            else{
                stu++;
                pagesStu=arr[i];
            }
        }
        return stu;
    }
   static int getMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
   static int getSum(int[] arr){
        int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
    }
    return sum;
}
} 
    