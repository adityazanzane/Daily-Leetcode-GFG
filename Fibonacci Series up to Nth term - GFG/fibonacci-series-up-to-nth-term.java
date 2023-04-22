//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans[] = obj.Series(n);
            for (long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    long[] Series(int N) {
        // code here
        long res[]=new long[N+1];
        res[0]=0;
        res[1]=1;
        for(int i=2;i<=N;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res;
    }
}