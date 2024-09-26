class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

    //1. reverse entire array i.e 7 6 5 4 3 2 1 
    reverse(nums,0,n-1);
    //2. reverse till k position i.e. 5,6,7,4, 3, 2, 1 
    reverse(nums,0,k-1);
    //3. reverse from k till end 5,6,7,1,2,3,4
    reverse(nums,k,n-1);
    }
 public static int [] reverse(int [] nums, int start, int end){
    while(start<end){
        int temp = nums[start]; 
        nums[start]=nums[end]; 
        nums[end]=temp;
        start++;
        end--;
    }
    return nums;
 }

}