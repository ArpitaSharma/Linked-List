class DeleteNodeAtGivenKey
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
	
	public void deleteNode(int key)
	{
		Node temp = head;
		Node prev = null;
		
		if(temp!=null && temp.data==key)
		{
			 head =temp.next;
			 return;
			 
		}
		while(temp!=null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		if(temp==null)
			return;
		
		prev.next = temp.next;
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
		DeleteNodeAtGivenKey l = new DeleteNodeAtGivenKey();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		System.out.println("Created Linked List: ");
		l.printList();
		l.deleteNode(2);
		System.out.println("After deleteing the new  Linked List: ");
		
		l.printList();
	}
}
