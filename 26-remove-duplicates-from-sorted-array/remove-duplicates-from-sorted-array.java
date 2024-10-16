class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index =1;
        for(int i=0; i<len-1 ;i++){
            if(nums[i] != nums[i+1]){
                nums[index++] = nums[i+1];
            }
        }
       
        /**
        * Below code is not needed as It does not matter
        * what you leave beyond the returned k (hence they are underscores).
        * for(int i=index;i<len;i++){
        *    nums[index]=0;
        * }
        **/
        return index;
    }
}