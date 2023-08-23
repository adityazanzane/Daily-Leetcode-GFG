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
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
        HashSet<Character> hset=new HashSet<>();
        
        int max=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            while(!hset.add(s.charAt(i))){
                hset.remove(s.charAt(l++));
            }
            max=Math.max(max, i-l+1);
        }
        return max;
    }
}