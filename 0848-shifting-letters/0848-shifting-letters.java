class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        int n = s.length();
        char[] arr = new char[26];
        for(int i=0;i<26;i++){
            arr[i]=(char)('a'+i);
        }
        char[] str = s.toCharArray();
        char[] str2 = new char[n];

        int[] sufsum = new int[n];
        sufsum[n-1] = shifts[n-1];
        for(int k=n-2;k>=0;k--){
            sufsum[k] = ((sufsum[k+1])+(shifts[k]))%26;
        }
        
        //  String ss = new String(sufsum);
        for(int i=0;i<n;i++){
            int idx = (int)((str[i]-'a'+sufsum[i])%26);
            str[i] = arr[idx];
        }
    
        return new String(str);




        
        
        




    }
}