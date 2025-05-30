class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=0,last=nums.length-1;
        int[] n=new int[2];
        n[0]=-1;
        n[1]=-1;
       for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(n[0]==-1){
                    n[0]=i;
                }
                // first=i;
                n[1]=i;
                // last=i;
                // n[0]=first;
                // n[1]=last;
                //  return n;
            }
            // else if(nums[i]!=target){
            //     n[0]=-1;
            //     n[1]=-1;
            //     return n;
            // }
       }
      
       return n;
   }
}