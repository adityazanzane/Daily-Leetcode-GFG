//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
        // your code here
        HashMap<Character,Integer> map=new HashMap();
        for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           if(map.containsKey(ch)){
               
               map.put(ch,map.get(ch)+1);
           }else{
               map.put(ch,1);
           }
        }
        int count=0;
        for(char ch:map.keySet()){
           if(map.get(ch)%2!=0){
               if(count==1)return 0;
               count++;
           }
        }
        return 1;
    }
}