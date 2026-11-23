class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] out = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <=nums2[i]){
                st.pop();
            }
            if(st.isEmpty())out[i]=-1;
            else out[i] = st.peek();
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i] = out[j];
                    break;
                }
            }
        }
        return nums1;
        
    }
}