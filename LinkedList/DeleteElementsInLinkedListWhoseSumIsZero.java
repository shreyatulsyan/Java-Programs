package LinkedList;

class DeleteElementsInLinkedListWhoseSumIsZero
{
	public static void main(String args[])
	{
		LinkedListTest linkedListTest = new LinkedListTest();
		for(int i=1;i<6;i++){
			linkedListTest.add(i);
		}
	
		//Delete the elements in an linked list whose sum is equal to zero
		linkedListTest.printMyList();
		System.out.println("Delete the elements in an linked list whose sum is equal to zero");
		// deleteElementsInLinkedListWhoseSumIsZero(linkedListTest);
		linkedListTest.printMyList();;
		
	}

	public static void deleteElementsInLinkedListWhoseSumIsZero()
	{
	
	}
}