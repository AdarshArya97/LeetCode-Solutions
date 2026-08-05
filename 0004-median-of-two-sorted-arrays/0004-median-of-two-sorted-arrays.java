class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int n = n1+n2;
        if(n1>n2) return  findMedianSortedArrays( b,  a);
        int lo = 0 , hi = n1;
        int left = (n1+n2+1)/2;
        while(lo<=hi){
            int mid1 = lo + (hi-lo)/2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE , l2=Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE , r2=Integer.MAX_VALUE;
            if(mid1<n1) r1 = a[mid1];
            if(mid2<n2) r2 = b[mid2];
            if(mid1-1>=0) l1 = a[mid1-1];
            if(mid2-1>=0) l2 = b[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2!=0) return Math.max(l1,l2);
                return ((double)(Math.max(l1,l2)+Math.min(r1,r2)))/2.0;
            } 
            else if (l1>r2) hi = mid1-1;
            else lo = mid1+1;

        }
        return 0;
    }
}