//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        int pos=0;
        int neg=0;
        int a[]=new int[n];
        int i=0;
        while(i<n){
            while(pos<n && arr[pos]<0) pos++;
            while(neg<n && arr[neg]>=0) neg++;
            if(pos<n) a[i++]=arr[pos++];
            if(neg<n) a[i++]=arr[neg++];
        }
        for(int k=0;k<n;k++){
            arr[k]=a[k];
        }
    }
}