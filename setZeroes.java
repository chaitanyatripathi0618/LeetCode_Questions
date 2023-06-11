class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int col[]=new int[n];
        int row[]=new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    col[j]=1;
                    row[i]=1;
                }
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                  if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }


       

       
        
    }
}
