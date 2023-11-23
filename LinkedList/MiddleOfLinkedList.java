class MiddleOfLinkedList
{
	public static void main(String args[])
	{
		LinkedListTest linkedListTest = new LinkedListTest();
		for(int i=1;i<6;i++){
			linkedListTest.add(i);
		}
	
		//FIND MIDDLE OF LINKED LIST
		linkedListTest.printMyList();
		System.out.println("FIND MIDDLE OF LINKED LIST");
		System.out.println("Middle is: " + findMiddleOfLinkedList(linkedListTest));
		
		//INSERT MIDDLE IN LINKED LIST
		System.out.println("INSERT MIDDLE IN LINKED LIST");
		insertMiddleInLinkedList(linkedListTest,0);
		linkedListTest.printMyList();

		//DELETE MIDDLE IN LINKED LIST
		System.out.println("DELETE MIDDLE IN LINKED LIST");
		deleteMiddleInLinkedList(linkedListTest);
		linkedListTest.printMyList();
	}

	public static int findMiddleOfLinkedList(LinkedListTest l)
	{
		LinkedListTest.Node start = l.head;
		LinkedListTest.Node end = l.head;

		while(end.next!=null && end.next.next!=null)
		{
			end = end.next.next;
			start = start.next;
		}
		return start.value;
	}

	public static void insertMiddleInLinkedList(LinkedListTest l,int val)
	{
		LinkedListTest.Node start = l.head;
		LinkedListTest.Node end = l.head;

		while(start!=null && start.next!=null)
		{
			start = start.next.next;
			end = end.next;
		}
		LinkedListTest.Node newNode = l.new Node(val);
		newNode.next = end.next;
		end.next=newNode;
	}

	public static void deleteMiddleInLinkedList(LinkedListTest l)
	{
		LinkedListTest.Node slow = l.head;
		LinkedListTest.Node fast = l.head;

		while(fast.next.next!=null && fast.next!=null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}

		slow.next=slow.next.next;
	}
}