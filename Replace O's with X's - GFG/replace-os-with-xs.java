//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static void dfs(int row, int col, boolean[][] vis, char a[][],int n, int m){
        if(row<0 || row>=n || col<0 ||col>=m || vis[row][col]==true || a[row][col]=='X') return;
        vis[row][col]=true;
        dfs(row+1,col,vis,a,n,m);
        dfs(row,col+1,vis,a,n,m);
        dfs(row-1,col,vis,a,n,m);
        dfs(row,col-1,vis,a,n,m);
    }
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i>0&&i<n-1&&j>0&&j<m-1)
                {
                    continue;
                }
                if(a[i][j]=='O')
                {
                    dfs(i,j,vis,a,n,m);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==true)
                {
                    a[i][j] = 'O';
                }
                else
                {
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
}

