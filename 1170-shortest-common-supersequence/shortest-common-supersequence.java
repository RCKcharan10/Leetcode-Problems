class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int l1=str1.length();
        int l2=str2.length();
        int i,j;
        int dp[][]=new int[l1+1][l2+1];
        for(i=1;i<=l1;i++){
            for(j=1;j<=l2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        
        StringBuilder scs=new StringBuilder();
        i=l1;j=l2;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                scs.append(str1.charAt(i - 1));  
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                scs.append(str1.charAt(i - 1));  
                i--;
            } else {
                scs.append(str2.charAt(j - 1));  
                j--;
            }
        }

        while(i>0){
            scs.append(str1.charAt(i-1));
            i--;
        }
        while(j>0){
            scs.append(str2.charAt(j-1));
            j--;
        }

        return scs.reverse().toString();
    }
}