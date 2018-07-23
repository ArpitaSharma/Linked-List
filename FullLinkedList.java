class FullLinkedList
{
	Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data =d;
			next = null;
		}
	}
		public void push(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
		
		public void InsertAfter(Node prev_node, int new_data)
		{
			if(prev_node==null)
			{
				System.out.println("prev node cant be empty");
				return;
			}
			Node new_node = new Node(new_data);
			new_node.next = prev_node.next;
			prev_node.next = new_node;
			
		}
		
		public void append(int new_data)
		{
			Node new_node = new Node(new_data);
			if(head == null)
			{
				head = new Node(new_data);
				return;
			}
			
			new_node.next=null;
			Node last = head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next=new_node;
			return;
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
			FullLinkedList l = new FullLinkedList();
			l.append(6);
			l.push(5);
			l.push(4);
			l.append(3);
			l.InsertAfter(l.head.next,99);
			 System.out.println("\nCreated Linked list is: ");
        	l.printList();
		}
	
		

		
}