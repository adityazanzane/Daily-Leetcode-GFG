//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        
        for(int i=2;i<=N;i++){
            int size=al.size();
            int carry=0;
            
            for(int j=0;j<size;j++){
                int temp=(al.get(j)*i+carry);
                al.set(j, temp%10);
                carry=temp/10;
            }
            
            while(carry > 0){
                al.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(al);
        return al;
    }
}