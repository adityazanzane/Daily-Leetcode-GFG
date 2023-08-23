//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s1, String s2) {
        // Code here
        int m=s1.length();
        int n=s2.length();
        
        int dp[][]=new int[m+1][n+1];
        
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return ed(s1, s2, m, n, dp);
    
    }
    
    public static int ed(String s1, String s2, int m, int n, int dp[][]){
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        
        if(m==0) return n;
        if(n==0) return m;
        
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            dp[m][n]=ed(s1, s2, m-1, n-1, dp);
        }else{
            dp[m][n]=1+Math.min(Math.min(ed(s1,s2,m,n-1,dp),ed(s1,s2,m-1,n,dp)),ed(s1,s2,m-1,n-1,dp));
        }
        return dp[m][n];
    }
}