class Solution {
    public static int up( int n,int m, int[][] up ){
        int temp=0;
        for(int i=0; i<m ; i++){
            for(int j=0;j<n ;j++){
                if (i == 0 || j == 0) {
                    up[i][j] = 1;
                } 
                else {
                    up[i][j] = up[i-1][j] + up[i][j-1];
                }
                
            }
        }
        return up[m-1][n-1];
    }
    public int uniquePaths(int m, int n) {
        int[][] up=  new int[m][n];

        // for(int i=0; i<n ; i++){
        //     for(int j=0;j<m ;j++){

        //     }
        // }
        int ans= up(n,m,up);
        return ans;
    }
}