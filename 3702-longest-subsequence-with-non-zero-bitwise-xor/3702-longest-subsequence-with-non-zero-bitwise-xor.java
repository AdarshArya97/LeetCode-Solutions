class Solution {
    public int longestSubsequence(int[] nums) {
        int total =0;
        boolean nonzero = false;
        for(int i=0;i<nums.length;i++){
            total = total^nums[i];
            if(nums[i]!=0){
                nonzero = true;
            }
        }
        if(total!=0){
            return nums.length;
        }
        if(nonzero==true){
            return nums.length-1;

        }
        return 0;
    }
}