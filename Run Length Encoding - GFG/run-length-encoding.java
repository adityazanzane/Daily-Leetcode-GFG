//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          if(str == null || str.isEmpty()) return "";
          
          StringBuilder sb=new StringBuilder();
          
          char currChar=str.charAt(0);
          int count=1;
          
          for(int i=1;i<str.length();i++){
              
              char c=str.charAt(i);
              
              if(c == currChar){
                  
                  count++;
                  
              }else{
                  
                  sb.append(currChar).append(count);
                  currChar=c;
                  count=1;
                  
              }
          }
          
        sb.append(currChar).append(count);
        return sb.toString();
	    
	}
	
 }