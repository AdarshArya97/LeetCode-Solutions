class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxi = -1;
        if(k==1){
            
            for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
                if(entry.getValue()==1){
                    maxi = Math.max(maxi,entry.getKey());
                }
            }
            return maxi;
        }
        if(k==nums.length){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>maxi){
                    maxi = nums[i];
                }
            }
            return maxi;
        }
        else{
            if(freq.get(nums[0])==1){
                maxi = Math.max(nums[0],maxi);

            }
            if(freq.get(nums[nums.length-1])==1){
                maxi = Math.max(nums[nums.length-1],maxi);
            }
            return maxi;

            
        }
        // return -1;
        
    }
}