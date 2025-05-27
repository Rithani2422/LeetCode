class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && el2!=nums[i]){
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && el1!=nums[i]){
                count2=1;
                el2=nums[i];
        }
        else if(nums[i]==el1)
        count1++;
        else if(nums[i]==el2)
        count2++;
         else {
            count1--;
            count2--;
         }
        }
     List<Integer> list=new ArrayList<>();
     int c1=0,c2=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==el1){
            c1++;
        }
        if(nums[i]==el2){
            c2++;
        }
     }
        int mini=(nums.length/3) +1;
        if(c1>=mini){
            list.add(el1);
        }
        if(c2>=mini){
            list.add(el2);
     }
     
     return list;
    }
}
