class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        int index = 1;
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
              list.add(nums[i]);
              nums[index++]=nums[i];
        }
        }
        return index;
          
    }
}