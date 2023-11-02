//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        String str = "";
        
        str+=S.charAt(0);
        
        for(int i=0;i<S.length()-1;i++)
        
        {
        
             if(S.charAt(i) ==' ' && S.charAt(i+1)!=' ') 
        
            {
        
                str+=S.charAt(i+1);
        
            }
        
            
        }
        return str;
    }
};