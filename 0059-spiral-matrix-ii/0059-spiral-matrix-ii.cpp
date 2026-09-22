class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> matrix(n, vector<int>(n));
        int minr = 0 , minc = 0;
        int maxr = n-1 , maxc = n-1;
        int tne = n*n;
        int count = 0;
        vector<int> v;
        while(minr<=maxr && minc<=maxc){
            for(int j= minc ; j<=maxc && count<tne ; j++){
                matrix[minr][j]=++count;
                // count++;
            }
            minr++;
            for(int i = minr ; i<=maxr && count<tne ; i++){
                matrix[i][maxc]=++count;
                // count++;
            }
            maxc--;
            for(int j = maxc ; j>=minc && count<tne; j--){
                matrix[maxr][j]=++count;
                // count++;
            }
            maxr--;
            for(int i = maxr; i>=minr && count<tne ; i--){
                matrix[i][minc]=++count;
                // count++;
            }
            minc++;
        }
        return matrix;
    }
};