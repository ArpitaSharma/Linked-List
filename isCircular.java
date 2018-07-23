class isCircular
{
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			next=null;
			d=data;
		}
		
		
	}
	boolean check(Node h)
	{
		if(h==null)
			return true;
		
		Node temp = head.next;
		while(temp!=null && temp !=head)
			temp = temp.next;
		
		return(head==temp);
		
		
	}
	
	public  static void main(String[] args)
	{
		isCircular l = new isCircular();
		l.head=new Node(2);
		l.head.next=new Node(3);
		l.head.next.next=new Node(5);
		l.head.next.next.next=head;
		
		if(l.check(head))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}


