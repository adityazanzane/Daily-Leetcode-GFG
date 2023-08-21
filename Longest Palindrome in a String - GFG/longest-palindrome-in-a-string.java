//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int len = S.length();
        int longestLength = 0;
        String res = S.substring(0,1);
        for(int i = 0; i < len; i++){
            
            int left = i-1;
            int right = i+1;
            
            while(left>= 0 && right < len && S.charAt(left) == S.charAt(right)){
                if(right - left + 1 > longestLength){
                    longestLength = right - left + 1;
                    res = S.substring(left, right+1);
                }
                left--;
                right++;
            }
            
            
            left = i;
            right = i + 1;
            while(left>=0 && right < len && S.charAt(left) == S.charAt(right)){
                if(right - left +1 > longestLength){
                    longestLength = right - left + 1;
                    res = S.substring(left, right+1);
                }
                left--;
                right++;
            }
        }
        return res;
    }
}