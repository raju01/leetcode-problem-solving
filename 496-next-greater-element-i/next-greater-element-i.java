class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums2.length;

        Map < Integer, Integer > map = new HashMap < > ();
        Stack < Integer > st = new Stack < > ();

        // If stack is empty then there is no greater element 
        st.push(nums2[len - 1]);
        map.put(nums2[len - 1], -1);

        for (int i = len - 2; i >= 0; i--) {
            int element = nums2[i];

            // this is the scenario where we are capturing the NGE in the map
            if (element < st.peek()) {
                map.put(element, st.peek());
                st.push(element);
                continue;
            }
            // Remove all the element smaller than current
            while (!st.isEmpty() && element > st.peek()) {
                st.pop();
            }

            // After removing chances is there stack is Empty so putting -1 in it
            if (st.isEmpty()) {
                st.push(element);
                map.put(element, -1);
             // If it is not empty then we are putting the element in map and also in the stack
            } else {
                map.put(element, st.peek());
                st.push(element);
            }
        }
        //Iterating and getting the all the NGE for the nums1 and replacing nums1 with NGE in place
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.get(nums1[i]);
            
        return nums1;
    }
}