class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i=0;
        int j=1;
        while(i<n&&j<n){
            if(arr[i]==0&&arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}