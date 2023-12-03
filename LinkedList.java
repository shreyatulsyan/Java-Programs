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
		ABC n = new ABC(4);
		n.next = head;
		head = n;
	}

	public void insertAtEnd()
	{
		ABC n = new ABC(7);

	}
	public void add()
	{
		LinkedList ll= new LinkedList();
		ll.head = new ABC(1);
		ABC second = new ABC(2);
		ABC third = new ABC(3);

		ll.head.next = second;
		second.next = third;
		ll.printList();
		ll.insertAtFront();
		ll.printList();

	}

	public void printList()
	{
		ABC temp = head;
		System.out.println("Printing..");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp =temp.next;
		}
	}


}