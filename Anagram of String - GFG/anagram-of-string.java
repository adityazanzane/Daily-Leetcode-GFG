//{ Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        int arr1[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            arr1[ch1-'a']++;
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch2=s1.charAt(i);
            arr1[ch2-'a']--;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            count +=Math.abs(arr1[i]);
        }
        return count;
    }
}