//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.sum(head, k));
		}
	}
}
// } Driver Code Ends


/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
        int count=0;
        int sum=0;
        
        Node temp=head;
        
        while(temp!=null)
        {
        
            count++;
            
            temp=temp.next;
            
        }
        
        temp=head;
        
        for(int i=0;i<(count-k);i++)
        {
        
            temp=temp.next;
        
            
        }
        
        while(temp!=null)
        {
        
            sum=sum+temp.data;
        
            temp=temp.next;
        
            
        }
        
        return sum;
    }
}