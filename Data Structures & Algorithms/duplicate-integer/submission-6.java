class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dup_finding_array = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            dup_finding_array.put(nums[i],dup_finding_array.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: dup_finding_array.entrySet()){
            if(entry.getValue()>1)
            return true;
        }
        return false;
    }
}