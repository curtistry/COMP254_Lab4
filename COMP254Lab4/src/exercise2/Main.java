package exercise2;

import java.util.Stack;
public class Main {
	static <E> void transfer(Stack<E> S, Stack<E> T)
	{
		Stack<E> temp = new Stack<E>();
		
		//traverse through stack S
		while (S.isEmpty() == false)
		{
			E obj = S.pop();
			temp.push(obj);
		}
		
		//traverse through temp. stack
		while (temp.isEmpty() == false)
		{
			E obj = temp.pop();
			T.push(obj);
		}
	}
	public static void main(String[] args)
	{
		Stack<String> stack1 = new Stack<String>();
		stack1.push("S1-1");
		stack1.push("S1-2");
		stack1.push("S1-3");
		stack1.push("S1-4");
		Stack<String> stack2 = new Stack<String>();
		stack2.push("S2-1");
		stack2.push("S2-2");
		stack2.push("S2-3");
		stack2.push("S2-4");
		
		System.out.println("Stack 1: " + stack1);
		System.out.println("Stack 2: " + stack2);
		
		//transfer elements from stack 1 to stack 2
		transfer(stack1,stack2);
		
		System.out.println("After transfer:");
		System.out.println("Stack 1: " + stack1);
		System.out.println("Stack 2: " + stack2);
	}
}
