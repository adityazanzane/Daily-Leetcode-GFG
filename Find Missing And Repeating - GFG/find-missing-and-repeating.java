//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
         long s = 0,p = n;
        Arrays.sort(arr);
        int[] a = {-1,-1};
        for(int i = 0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                a[0] = arr[i];
                break;
            }
        }
        for(int i = 0;i<n;i++){
            s+=arr[i];
        }
        a[1] = ((int)(p*(p+1)/2) - (int)(s-a[0]));
        return a;
    }
}