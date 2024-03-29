class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        
        if(grid[0][0] == 1) return 0;
        
        dp[0][0] = 1;
        
        for(int i = 1; i < n; i++){
            if(grid[i][0] != 1) dp[i][0] = dp[i-1][0];
            else dp[i][0] = 0;
        }
        
        for(int i = 1; i < m; i++){
            if(grid[0][i] != 1) dp[0][i] = dp[0][i-1];
            else dp[0][i] = 0;
        }
        
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(grid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[n-1][m-1];
    }
}