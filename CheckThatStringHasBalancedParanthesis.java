import java.util.Stack;
class CheckThatStringHasBalancedParanthesis
{
	public static void main(String args[])
	{
		System.out.println(checkBalancedParanthesis("{{[[(())]]}}"));
	}
	public static String checkBalancedParanthesis(String str)
	{
		Stack<Character> stack = new Stack<Character>();

		char[] ch = str.toCharArray();

		for(char eachChar : ch)
		{
			if(eachChar=='(' || eachChar=='{' || eachChar=='[')
			{
				stack.push(eachChar);
				continue;
			}
			else{
			if(stack.empty())
			return "NO";
		
			if(eachChar==')' && stack.peek()=='(')
			{
			   stack.pop();
			}
			else if(eachChar==']' && stack.peek()=='[')
			{
			   stack.pop();
			}
			else if(eachChar=='}' && stack.peek()=='{')
			{
			   stack.pop();
			}
			else
			{
				return "NO";
			}
		}
		}

		if(stack.empty())
		return "YES";
		else
		return "NO";
	}
}