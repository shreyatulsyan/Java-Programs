package LinkedList;

class DeleteFromStart
{
	public static void main(String args[])
	{
		LinkedListTest linkedListTest = new LinkedListTest();
		for(int i=1;i<6;i++){
			linkedListTest.add(i);
		}
		linkedListTest.printMyList();

		//DELETE FROM START
		deleteFromStart(linkedListTest);
		System.out.println("DELETE FROM START");
		linkedListTest.printMyList();

		//DELETE FROM END
		deleteFromEnd(linkedListTest);
		System.out.println("DELETE FROM END");
		linkedListTest.printMyList();

		//DELETE AT PARTICULAR INDEX
		System.out.println("DELETE AT PARTICULAR INDEX");
		deleteAtParticularIndex(linkedListTest,-1);
		linkedListTest.printMyList();
	}

	public static void deleteFromStart(LinkedListTest l)
	{
		l.head = l.head.next;
	}

	public static void deleteFromEnd(LinkedListTest l)
	{
		LinkedListTest.Node temp = l.head;
		if(l.head==null)
			return;

		if(l.head.next==null)
			return;

		while(temp.next.next!=null)
		{
			temp = temp.next;
		}
		temp.next=null;
	}
	public static void deleteAtParticularIndex(LinkedListTest l,int index)
	{
		LinkedListTest.Node temp = l.head;
		if(index<0)
		{
			System.out.println("Not a valid index");
		}
		else if(index==0)
		{
			l.head=l.head.next;
		}
		else
		{
		while(index>1)
		{
			temp = temp.next;
			index--;
		}
		temp.next= temp.next.next;
	}
	}

}
