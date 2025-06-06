class Solution {
    public int subarraySum(int[] nums, int k) {
          HashMap<Integer,Integer> map=new HashMap<>();
          int preSum=0,cnt=0;
          map.put(0,1);
          for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
          
            if (map.containsKey(preSum - k)) 
            {
                cnt += map.get(preSum - k);
            }
          
           map.put(preSum, map.getOrDefault(preSum, 0) + 1);
          }
          return cnt;
    }
}