class countNodes
{
	Node head;
	class Node{
		Node next;
		int data;
		Node(int d)
		{
			data = d;
			next=null;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head= new_node;
		
	}
	
	public int counting()
	{
		Node temp = head;
		int count=0;
		while(temp!=null)
		{
			count ++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args)
	{
		countNodes c = new countNodes();
		c.push(1);
		c.push(3);
		c.push(2);
		c.push(4);
		System.out.println(" "+c.counting());
		
		
	}
	
}