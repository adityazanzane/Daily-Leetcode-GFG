//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{ 
  
    // function to count all pairs  
    // from both the sorted arrays  
    // whose sum is equal to a given  
    // value 
    static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
    { 
        //code here.
        int j=N-1, counter = 0 ;
       for(int i=0 ; i<M; i++)
       {
           while(j>=0 && arr1[i]+arr2[j] > x)
           {
               j--;
           }
           if(j==-1 )
            break ;
           if(j>=0 && arr1[i]+arr2[j] == x)
             counter++;
           
       }
       return counter;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    //int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int m=Integer.parseInt(a1[0]);
		    int n=Integer.parseInt(a1[1]);
		    String line2 = br.readLine();
		    String[] a2 = line2.trim().split("\\s+");
		    int a[]=new int[m];
		    for(int i=0;i<m;i++)
		    {
		        a[i]=Integer.parseInt(a2[i]);
		    }
		    String line3 = br.readLine();
		    String[] a3 = line3.trim().split("\\s+");
		    int b[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        b[i]=Integer.parseInt(a3[i]);
		    }
		    int x=Integer.parseInt(br.readLine());
		    Solution ob=new Solution();
		    int ans=ob.countPairs(a,b,m,n,x);
		    System.out.println(ans);
		    
		}
	}
}

// } Driver Code Ends