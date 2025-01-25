class Solution {
    public int maxArea(int[] height) {
        // Let's take 2 pointer left and right 
        // area = Math.min(height[left],height[right]) and maxArea
        // will move the pointer with min height 
      int left=0,right=height.length-1,maxArea=0;
    while(left<=right){
       int area = Math.min(height[left],height[right])*(right-left);
        maxArea=Math.max(maxArea,area);
        if(height[left]<height[right]){
                left++;
        }else{
            right--;
        }
    }
    return maxArea;
  }
}