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
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> pattern(int N){
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        pattern(N, arr);
        return arr;
    }
    public static void pattern(int n, ArrayList<Integer> arr){
        if(n<=0){
            arr.add(n);
            return;
        }
        arr.add(n);
        pattern(n-5, arr);
        arr.add(n);
    }
}