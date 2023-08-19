//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1!=n2){
            return false;
        }
        char [] c1 = new char[256];
        char [] c2 = new char[256];
         
        for(int i = 0;i<n1;i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
             
            if(c1[ch1]==0 && c2[ch2]==0){
                 c1[ch1]=ch2;
                 c2[ch2]=ch1;
            }else if(c1[ch1]!=ch2){
                 return false;
            }
         }
        return true;
    }
}