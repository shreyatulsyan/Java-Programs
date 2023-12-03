package LinkedList;

public class LinkedListTest
{
	public Node head;

	class Node
	{
		Node next;
		int value;

		Node(int value)
		{
			this.value = value;
			next = null;
		}
	}

	public void add(int val)
	{
		Node n = new Node (val);
		
		if(head==null)
			head=n;
		else	
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}

	public void insertAtParticularIndex(int value,int index)
	{
		Node newNode = new Node(value);
		Node temp = head;

		if(head==null)
			System.out.print("head is null");

		if(index<0)
		{
			System.out.print("Not valid");

		}
		if(index==0)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			while(index!=1)
			{
				temp = temp.next;
				index--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	public void printMyList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

}
class MyClass
{
	public static void main(String args[])
	{
		LinkedListTest linkedListTest = new LinkedListTest();
		linkedListTest.add(3);
		linkedListTest.add(4);
		linkedListTest.add(5);
		linkedListTest.printMyList();
		linkedListTest.insertAtParticularIndex(7,0);
		System.out.println();
		linkedListTest.printMyList();
		
	}
}

