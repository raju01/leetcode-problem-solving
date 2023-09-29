class Solution {
    public boolean canPartition(int[] arr) {
        int m=arr.length;
        int sum =0;
        for(int i=0;i<m;i++){
            sum+=arr[i];
        }
        if(sum%2!=0) return false;
        sum=sum/2;
        
        int n=sum;
        boolean dp[][] = new boolean[m+1][n+1];
        
        for(int i=0;i<m+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(j>=arr[i-1]){
                    dp[i][j]=(dp[i-1][j] || dp[i-1][j-arr[i-1]]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
           
        }
         return dp[m][n];
    }
}