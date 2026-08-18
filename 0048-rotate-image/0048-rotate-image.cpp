class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int l = matrix.size();
        
        for(int i =0 ; i<l ; i++){
            for(int j = i+1 ; j<l ; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
                            
                }
        }
        for(int k = 0; k<l; k++){
            int i =0 ;
            int j =l-1;
            while(i<=j){
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
                i++;
                j--;
            
            }
        }

    }   
};