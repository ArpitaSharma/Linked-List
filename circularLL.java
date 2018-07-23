class circularLL
{
	static Node head;
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			d=data;
			next=null;
		}
	
	}
	void printLL(Node n)
	{
		Node temp = n;
		if(n!=null)
		{
			do
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
			while(temp!=n);
		}
	}
	
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public static void main(String[] args)
	{
		circularLL l= new circularLL();
		l.push(10);
		l.push(20);
		l.push(29);
		l.push(45);
		System.out.println("Contents of Circular Linked List\n ");
		l.printLL(head);
	}
}