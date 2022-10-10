class Solution {
    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length();
        int dp[][] = new int[n+1][m+1];
        for(int[]i:dp)Arrays.fill(i,-1);
        return lcs(n-1,m-1,p,s,dp)==1?true:false;
    }
    public static int lcs(int i,int j,String pattern,String text,int[][]dp){
        if(i<0 && j<0)return 1;
        if(i<0 && j>=0)return 0;
        if(i>=0 &&j<0){
            return allStars(pattern,i)?1:0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(pattern.charAt(i)==text.charAt(j) || pattern.charAt(i)=='?'){
            return dp[i][j] = lcs(i-1,j-1,pattern,text,dp);
        }
        if(pattern.charAt(i)=='*'){
            return dp[i][j] = lcs(i-1,j,pattern,text,dp)|lcs(i,j-1,pattern,text,dp);
        }
        return 0;
    }
    public static boolean allStars(String pattern,int i){
        for(int i1=0;i1<=i;i1++){
                if(pattern.charAt(i1)!='*')return false; 
            }
            return true;
    }
}
