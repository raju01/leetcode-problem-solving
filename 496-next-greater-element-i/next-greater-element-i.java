class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums2.length;
        int result[] = new int[nums1.length];
        Map < Integer, Integer > map = new HashMap < > ();
        Stack < Integer > st = new Stack < > ();

        // If stack is empty then there is no greater element 
        st.push(nums2[nums2.length - 1]);
        map.put(nums2[nums2.length - 1], -1);

        for (int i = len - 2; i >= 0; i--) {
            int element = nums2[i];

            if (element < st.peek()) {
                map.put(element, st.peek());
                st.push(element);
                continue;
            }
            // Remove all the element smaller than current
            while (!st.isEmpty() && element > st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                st.push(element);
                map.put(element, -1);
            } else {
                map.put(element, st.peek());
                st.push(element);
            }
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.get(nums1[i]);
        return nums1;
    }
}