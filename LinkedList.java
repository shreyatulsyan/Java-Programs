class LinkedList
{
	ABC head;

	static class ABC
	{
		int data;
		ABC next;

		ABC(int d)
		{
			data = d;
		}
	}

	public static void main(String args[])
	{
		LinkedList ll= new LinkedList();
		ll.add();
	}

	public void insertAtFront()
	{
		Node n = new Node(4);
		n.next = head;
		head = n;
	}

	public void insertAtEnd()
	{
		Node n = new Node(7);

	}
	public void add()
	{
		LinkedList ll= new LinkedList();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		ll.head.next = second;
		second.next = third;
		ll.printList();
		ll.insertAtFront();
		ll.printList();

	}

	public void printList()
	{
		Node temp = head;
		System.out.println("Printing..");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp =temp.next;
		}
	}


}