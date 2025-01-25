class Solution {
    public int searchInsert(int[] nums, int target) {
        // Thinking on the solution below then writing the code for it 
        //low, high and then find mid ~ 0,4, 2
        // if value at mid and target equals then return mid 
        // else if target is greater than value at mid then low = mid+1
        //else high will be mid -1

        //nums = [1,3,5,6], target = 2
        int low = 0, high = nums.length - 1; //low=0,high=3
        while (low <= high) {
            int mid = low + (high - low) / 2; //mid=1 //mid=0
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1; //low=1
            } else {
                high = mid - 1; //high=0
            }
        }
        return low;
    }
}

/**
 *
 * return low OR high+1
 * 
 *  or can return here high+1 also both are fine since  high will be lessor than and it will come out of loop here means if coming out of loop low will be always higher than high means high will be always lessor than low and this will be breaking condition and that will be point where it will be finally searching to get the searched result and if not it will come out of loop just by making the low and high position as very closer to the index where item should be available since that was the closest search to ge the result
 * 
 * 
 */
