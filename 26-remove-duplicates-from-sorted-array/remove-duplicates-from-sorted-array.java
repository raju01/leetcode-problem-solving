class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count=1;
        for(int i=0;i<len-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[count++]=nums[i+1];
            }
        }
        return count;
    }
}