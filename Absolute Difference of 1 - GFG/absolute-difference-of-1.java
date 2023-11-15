//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            long k = Long.parseLong(inputLine[1]);
            long[] arr = new long[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            long[] ans = new Solution().getDigitDiff1AndLessK(arr, n, k);
            for (long ele : ans) {
                System.out.print(ele + " ");
            }
            if (ans.length == 0) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java





class Solution {
    long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        
        for(int i = 0; i<n;i++){
            long p = arr[i];
            if(p < k){
                if(isValid(p)){
                    al.add(p);
                }
            }
        }
        
        long[] ans = new long[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        
        return ans;
    }
    
        static boolean isValid(long p) {
        if(p / 10 == 0){
            return false;
        }
        long prevDigit = p % 10;
        p /= 10;
        while (p != 0) {
            long currDigit = p % 10;
            if (Math.abs(currDigit - prevDigit) != 1) {
                return false;
            }
            prevDigit = currDigit;
            p /= 10;
        }
        return true;
    }
}
