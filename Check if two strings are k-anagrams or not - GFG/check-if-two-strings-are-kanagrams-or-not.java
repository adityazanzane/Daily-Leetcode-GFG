//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length() != s2.length()) return false;
        
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(char c: c1){
            
            if(map.containsKey(c)){
        
                map.put(c, map.get(c)+1);
        
            }else{
        
                map.put(c, 1);
        
            }
        }
        
        int count=0;
        
        for(char c: c2){
        
            if(map.containsKey(c) && map.get(c)>0){
        
                map.put(c, map.get(c)-1);
        
            }else{
        
                count++;
        
            }
        }
        return count <= k;
    }
}