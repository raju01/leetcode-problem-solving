class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        if(nums==null || len<3) 
          return new ArrayList<>();
        //Sort it here first
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<len-2;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int left = i+1;
            int right=len-1;
            while(left<right){
            int sum= nums[i]+nums[left]+nums[right];
            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }else if(sum<0){
                left++;
            }else{
                 right--;
            }
         }
        }
       return new ArrayList<>(result);  
    }
}