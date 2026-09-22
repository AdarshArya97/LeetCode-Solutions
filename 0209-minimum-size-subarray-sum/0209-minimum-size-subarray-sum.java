class Solution {
    public int minSubArrayLen(int t, int[] arr) {
            int n = arr.length ;
            int minlen = Integer.MAX_VALUE;
            int i =0 , j =0 ,sum =0;
            while(j<n && sum<t){ // first window
                sum+=arr[j++];
            }
            j--;
            while(i<n && j<n){
                int len = j-i+1;
                if(sum>=t) minlen = Math.min(minlen,len);
                sum-=arr[i];
                i++;j++;
                while(j<n && sum<t){
                    sum+=arr[j++];
                }
                j--;
            }
            if(minlen==Integer.MAX_VALUE) return 0;
            return minlen;

    }
}