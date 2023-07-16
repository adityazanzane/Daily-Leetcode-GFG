//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.safePos(n,k));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int safePos(int n, int k) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        helper(al, k, k-1);
        return al.get(0);
    }
    public static void helper(ArrayList<Integer> al, int k, int idx){
        if(al.size()==1) return;
        if(idx>=al.size()) idx%=al.size();
        al.remove(idx);
        helper(al, k, idx+k-1);
    }
};