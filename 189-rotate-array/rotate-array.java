class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
      k=k%len; 
      //Reverse the entire array  
      reverse(nums,0,len-1);
      //reverse till k-1
      reverse(nums,0,k-1);
     //reverse from k till end
      reverse(nums,k,len-1);
 
    }

    public int[] reverse(int [] nums, int start, int end){
        //Here condition will be based on start and end not based on length
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--; 
        }
        return nums;
    }
}