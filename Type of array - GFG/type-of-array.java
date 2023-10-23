//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            pair product = obj.maxNtype(a, n);  
            System.out.println(product.second+" "+product.first);
        }
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static pair maxNtype(long arr[], long n)
    {
        long min  = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        
        int type = 0;
        
        for(int i=0; i<n;i++)
        {
            if(arr[i]<min)
                min =arr[i];
              
            if(arr[i]>max)
                max = arr[i];
          }
          
          if(arr[0] == min && arr[arr.length-1] == max) type = 1;
               
          else if(arr[0] == max && arr[arr.length-1] == min) type = 2;
          
          else if(arr[0]< arr[arr.length-1]) type = 3;
           
          else{
           type = 4;
          }
        return new pair(type,max);
    }
}

