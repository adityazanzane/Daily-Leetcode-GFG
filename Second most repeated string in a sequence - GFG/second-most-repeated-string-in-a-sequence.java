//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {

        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
      


      int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           max=Math.max(max, map.get(arr[i]));
       }


       int ans=Integer.MIN_VALUE;
       String ansString="";
       for(int i=0;i<arr.length;i++)
       {
           if(map.get(arr[i])==max)continue;
           else if(map.get(arr[i])>ans)
           {
           ans=map.get(arr[i]);
           ansString=arr[i];
           }
       }
     
        return ansString;
    }
}