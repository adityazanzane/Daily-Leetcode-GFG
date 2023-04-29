//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int ans = ob.lastNon0Digit(N);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java


class Solution{
    
    int lastNon0Digit(int N){
        // Code here
        long fact=1, rem;
        long count=0;
        for(int i=1;i<=N;i++){
            fact*=i;
            while(fact%10==0)
                fact=fact/10;
                fact%=1000000000;
        }
        return (int)fact%10;
    }
    
}