class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)
             return mid;
         //Considering 1st part is sorted    
        if(nums[low]<=nums[mid]){
            // Target is lying in between the first part, we are not doing = check for mid here 
            // since it is already been chceked at line 7
            if(nums[low]<=target && target<nums[mid]){
                high=mid-1;
            }else{
                low = mid+1;
            }

        //If first part was not sorted then by defaut 2nd part is sorted
         }else{
            //we are checking if the target is lying in betwee the mid and high
            if(nums[mid]<target && target<=nums[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
          }
        }
        return -1;
    }
}