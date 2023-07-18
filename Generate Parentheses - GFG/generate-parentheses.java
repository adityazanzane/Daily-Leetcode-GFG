//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        ArrayList<String> al=new ArrayList<>();
        helper(n,al,0,0,"");
        return al;
    }
    public void helper(int n, ArrayList<String>al, int ob, int cb, String s){
        if(ob==n && cb==n){
            al.add(s);
            return;
        }
        if(ob<n){
            helper(n,al,ob+1,cb,s+"(");
        }
        if(cb<ob){
            helper(n,al,ob,cb+1,s+")");
        }
    }
}