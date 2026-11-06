class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int v:nums){
            if(!set.add(v))return true;          
        }
        return false;
    }
}