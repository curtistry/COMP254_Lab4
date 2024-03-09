package exercise1;

public class Main {
	public static void main(String[] args)
	{
		LinkedPositionalList<String> l1 = new LinkedPositionalList<String>();
		
		//populate the positional list
		Position<String> p0 = l1.addLast("A");
		Position<String> p1 = l1.addLast("B");
		Position<String> p2 = l1.addLast("C");
		Position<String> p3 = l1.addLast("D");
		Position<String> p4 = l1.addLast("E");
		Position<String> p5 = l1.addLast("F");
						
		System.out.println(l1);
		
		Position<String> testPosition = p5;
		int index = l1.indexOf(testPosition);
		
		System.out.printf("\nIndex of %s: %d",testPosition.getElement(), index);
		
		testPosition = p2;
		index = l1.indexOf(testPosition);
		
		System.out.printf("\nIndex of %s: %d",testPosition.getElement(), index);
	}
}
