//Input : a  b  c  d  e   N = 2
//Output : c  d  e  a  b 
class tryRotateDL
{
	Node head;
	class Node{
		Node prev,next;
		int data;
		Node(int d)
		{
			next=prev=null;
			data=d;
		}
	}
	void Rotate(Node head_r, int n)
	{
		if (n==0)
			return;
		Node curr = head_r;
		int count =1;
		
		while(curr.next!=null && count <n)
		{
			curr=curr.next;
			count++;
		}
		
		if(curr==null)
			return;
		 
		 Node nthNode = curr;
		 
		 while(curr!=null)
			 curr=curr.next;
		 
		 curr.next = head_r;
		 head_r.prev=current;
		 
		 head_r= nthNode.prev;
		 
		 head_r.prev=null;
		 nthNode.next=null;
		 
		 
		 
		
		
		
	}
	
	
}