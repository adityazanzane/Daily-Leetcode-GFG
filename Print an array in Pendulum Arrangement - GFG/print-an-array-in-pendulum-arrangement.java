//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            int answer[] = obj.pendulumArrangement(arr, n);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Compute {
    public int[] pendulumArrangement(int arr[], int n) {
        // Write your code here
        int j=0;
        Arrays.sort(arr);
        int a[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(i%2==0 && j>=0){
                a[j]=arr[i];
                j++;
            }
        }
        
        for(int i=0;i<n;i++){
            if(i%2!=0 && j<n){
                a[j]=arr[i];
                j++;
            }
        }
        return a;
    }
}