//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.optimalKeys(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int optimalKeys(int N){
        // code here
        if (N<=6) return N;
        int[] screen = new int[N+1];
        for (int i=1; i<=6; i++) {
            screen[i]=i;
        }
        for (int n=7; n<=N; n++) {
            screen[n]=n; // Print all As
            // Find optimal breakpoint
            for (int b=n-3; b>=1; b--) {
                // b=already printed. Remaining ctrl-V (n-b) minus 2 for ctrl-A, ctrl-C
                screen[n] = Math.max(screen[n], (n-b-2) * screen[b] + screen[b]);
            }
        }
        return screen[N];
    }
}