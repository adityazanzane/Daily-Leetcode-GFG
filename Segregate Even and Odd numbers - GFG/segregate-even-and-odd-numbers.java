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

            new Solution().segregateEvenOdd(arr, n);
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
    void segregateEvenOdd(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int [] array = new int[n];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                array[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(arr[i]%2!=0){
                array[index] = arr[i];
                index++;
            }
        }
        for(int i=0;i<array.length;i++){
            arr[i] = array[i];
        }
    }
}