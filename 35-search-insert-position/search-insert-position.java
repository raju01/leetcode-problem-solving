class Solution {
    public int searchInsert(int[] nums, int target) {
        //low, high and then find mid ~ 0,4, 2
        // if value at mid and target equals then return mid 
        // else if target is greater than value at mid then low = mid+1
        //else high will be mid -1

        //nums = [1,3,5,6], target = 2
        int low=0,high=nums.length-1; //low=0,high=3
        while(low<=high){ 
            int mid = low+(high-low)/2; //mid=1 //mid=0
            if(nums[mid]==target){
               return mid;
            }else if(nums[mid]<target){ 
                low=mid+1;  //low=1
            }else{
                high=mid-1;  //high=0
            }
        }
        return high+1;
    }
}