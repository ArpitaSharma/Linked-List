class DeleteNodeAtGivenPositin
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
				
	}
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void deleteNode(int position)
	{
		Node temp = head;
		if(head==null)
			return;
		if(position==0)
		{
			head = temp.next;
			return;
		}
		int i;
		
		for(i=0;i<position-1 && temp!=null;i++)
		{
			temp =temp.next;
		}
		if(temp == null|| temp.next==null)
			return;
		
		Node next = temp.next.next;
		
		temp.next = next;
	}
	
	public void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
			
		}
	}
	
	public static void main(String[] args)
	{
		DeleteNodeAtGivenPositin l = new DeleteNodeAtGivenPositin();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		System.out.println("Created Linked List: ");
		l.printList();
		l.deleteNode(2);
		System.out.println("After deleteing the new  Linked List: ");
		
		l.printList();
	}
}
