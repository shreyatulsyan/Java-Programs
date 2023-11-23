class ImplementingLinkedList
{
	public static void main(String args[])
	{
		LinkedList1 ll =  new LinkedList1();
		ll = ll.insert(ll,10);
		ll = ll.insert(ll,11);
		ll = ll.insert(ll,9);
		ll = ll.insert(ll,11);
		ll = ll.insert(ll,8);


		LinkedList1.delete(ll,2);
		LinkedList1.printList(ll);

		/*LinkedList1.deleteByKey(ll,12);
		LinkedList1.printList(ll);
		LinkedList1.deleteAtPosition(ll,3);
		LinkedList1.printList(ll);*/

		//ReverseALinkedList.reverse(ll.head);
		//ReverseALinkedList.reverseUsingStack(ll.head);
		//System.out.println("Is Pallindrome: " + checkPallindrome.isPallindrome(ll.head));
		
	}
}