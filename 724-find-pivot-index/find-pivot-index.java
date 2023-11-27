class Solution {
    public int pivotIndex(int[] nums) {
     int sum=0;   
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }
     int lsum=0,rsum=sum;
     for(int i=0;i<nums.length;i++){
         if(lsum==rsum-nums[i])
          return i;
          lsum+=nums[i];
          rsum-=nums[i];
        }
        return -1;
    }
}