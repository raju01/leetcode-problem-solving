class Solution {
    public int pivotIndex(int[] nums) {
        int lSum=0,rSum=0;
        for(int num : nums){
            rSum+=num;
        }
    for(int i=0;i<nums.length;i++){
        if(lSum==rSum-nums[i])
            return i;
        lSum+=nums[i];
        rSum-=nums[i];

    }
     return -1;
    }
}