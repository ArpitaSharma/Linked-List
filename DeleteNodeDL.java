class DeleteNodeDL
{
	static Node head;
	static class Node{
		Node prev,next;
		int data;
		Node(int d)
		{
			data=d;
			prev=next=null;
		}
	}
	void deleteN(Node head_ref,Node del)
	{
		if(head==null || del==null)
			return;
		if(head==del)
			head = head.next;
		
		if(del.next !=null)
			del.next.prev=del.prev;
		
		if(del.prev!=null)
			del.prev.next= del.next;
		
		return;
	}
	
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.prev=null;
		new_node.next=head;
		if(head!=null)
			head.prev=new_node;
		
		head=new_node;
		
	}
	void printDL(Node n)
	{
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	
	public static void main(String[] args)
	{
		DeleteNodeDL list = new DeleteNodeDL();
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(9);
		System.out.println("Original ");
		list.printDL(head);
		
		list.deleteN(head,head.next);
		System.out.println(" Now");
		list.printDL(head);
	}
}
