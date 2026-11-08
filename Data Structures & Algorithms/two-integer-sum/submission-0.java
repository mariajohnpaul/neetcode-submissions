class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int v = map.getOrDefault(target-nums[i],-1);
            if(v!=-1){
                return new int[]{v,i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
