class Solution {
    public int multiply(int n){
        int mul =1;
        int temp =n;
        while(temp!=0){
            int digit = temp%10;
            mul *= digit;
            temp = temp/10;
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+100;i++){
            int x = multiply(i);
            if(x%t==0) return i;
        }
        return 0;
    }
}