class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int i=0;
        int j= arr.length-1;
        while(i<j){
            arr[i] = nums[i];
            arr[j] = nums[i];
            i++;
            j--;
        }
        return arr;
        
    }
}