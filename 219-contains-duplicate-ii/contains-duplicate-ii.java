class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
               HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); 
        }

        return false;
        //  Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //      int num=  Math.abs(i-j);
        //      if(num<=k){
        //         return true;
        //      }
        //      return false;
        //     }
        // }
    }
}