//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        int left=0, right=0, i=0, countzero=0;
        
        if(i==0 && s.charAt(i) == '.') return false;
        
        for(i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) return false;
            
            if(s.charAt(i)=='.'){
                countzero++;
                if(s.charAt(i-1)=='.') return false;
                if(s.substring(left, i).length()>3) return false;
                if(s.charAt(left)=='0' && s.substring(left,i).length()>1) return false;
                Integer num=Integer.parseInt(s.substring(left, i));
                if(num>=0 && num<=255){
                    left=i+1;
                    continue;
                }
                else return false;
            }
            else if(i == s.length()-1){
                if(s.substring(left, i+1).length()>3) return false;
                if(s.charAt(left) == '0' && s.substring(left,i+1).length()>1) return false;
                
                Integer num = Integer.parseInt(s.substring(left,i+1));
                if(num>=0 && num <= 255){
                    left = i+1;
                    continue;
                }
                else
                    return false;
            }
        }
        if(countzero == 3)
            return true;
        return false;
        
    }
}