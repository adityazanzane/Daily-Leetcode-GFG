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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void gfSeries(int N){
        // code here
        long a[]=new long[N];
        a[0]=0;
        a[1]=1;
        
        for(int i=2;i<N;i++){
            a[i]=(a[i-2]*a[i-2])-(a[i-1]);
        }
        for(int i=0;i<N;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}