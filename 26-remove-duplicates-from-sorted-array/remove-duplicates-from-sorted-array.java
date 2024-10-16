class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index =1;
        for(int i=0; i<len-1 ;i++){
            if(nums[i] != nums[i+1]){
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}