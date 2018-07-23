class ReverseLL
{
	static Node head;
    static class Node{
		int data;
		Node next;
		Node(int d)
		{
			d = data;
			next = null;
		}
	}
	
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current=next;
		}
		node = prev;
		return node;
	}
	
	void printLL(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	
	public static void main(String args[])
	{
		ReverseLL list = new ReverseLL();
		list.push(12);
		list.push(11);
		list.push(10);
		list.push(9);
		list.push(8);
		list.push(7);
		System.out.println(" Before ");
		list.printLL(head);
		head = list.reverse(head);
		System.out.println(" After ");
		list.printLL(head);
	
	}
}