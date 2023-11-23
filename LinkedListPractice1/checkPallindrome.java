import java.util.Stack;
class checkPallindrome
{
	public static boolean isPallindrome(LinkedList1.Node head)
	{
		boolean isPall = true;

		Stack<Integer> stack = new Stack<>();

		LinkedList1.Node temp = head;

		while(temp!=null)
		{
			stack.push(temp.data);
			temp = temp.next;
		}

		while(head!=null)
		{
			if(head.data==stack.pop())
			{
				isPall=true;
			}
			else
			{
				isPall=false;
				break;
			}
			head=head.next;
		}

		return isPall;


	}
}