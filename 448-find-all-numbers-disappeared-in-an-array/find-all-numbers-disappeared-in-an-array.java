class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
        if(!(list.contains(i))){
              a.add(i);
        }
    }
    return a;
}
}