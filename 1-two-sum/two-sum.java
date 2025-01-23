class Solution {
    public int[] twoSum(int[] nums, int target) {
        //[2,7,11,15]
        Map<Integer, Integer> map = new HashMap<>();// [{2,0}, ]
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }else{
                map.put(nums[i], i);
            }

        }
        return new int[]{-1,-1};
    }
}