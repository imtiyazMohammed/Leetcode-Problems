class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int []lm= new int[n];
        lm[0]=height[0];
        for(int i=1;i<n;i++){
            lm[i]= Math.max(height[i],lm[i-1]);
        }
        int []hm= new int[n];
        hm[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            hm[i]= Math.max(height[i],hm[i+1]);
        }
        int tr=0;
        for(int i=0;i<n;i++){
            tr+= Math.min(lm[i],hm[i])-height[i];
        }
        return tr;
    }
}
