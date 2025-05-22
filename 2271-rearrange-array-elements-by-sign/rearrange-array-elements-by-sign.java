class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a=new int[nums.length];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[posIndex]=nums[i];
                posIndex+=2;
                
                
            }
            
            else {
                a[negIndex]=nums[i];
                negIndex+=2;
            
        }
        }
        return a;

    }
}