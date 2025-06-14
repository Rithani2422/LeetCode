class Solution {
    public int thirdMax(int[] nums) {
  
    Arrays.sort(nums);
    // if(nums.length>3){
    //     if(nums[nums.length-3]==nums[nums.length-2]){
    //         return nums[nums.length-3]-1;
    //     }
    // else{
    //      return nums[nums.length-3];
    // }
    // }
      
    
    // return nums[nums.length-1];
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=nums.length-1;i>=0;i--){
        if(!(list.contains(nums[i]))){
            list.add(nums[i]);

        }

    }
    if(list.size()<3){
        return list.get(0);
    }
     return list.get(2);
    }
}