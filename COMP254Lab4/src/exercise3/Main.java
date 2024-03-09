package exercise3;

public class Main {
	public static void main(String[] args) {
		LinkedQueue<String> queue1 = new LinkedQueue<String>();
		queue1.enqueue("Q1 - A");
		queue1.enqueue("Q1 - B");
		queue1.enqueue("Q1 - C");
		queue1.enqueue("Q1 - D");
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		queue2.enqueue("Q2 - A");
		queue2.enqueue("Q2 - B");
		queue2.enqueue("Q2 - C");
		queue2.enqueue("Q2 - D");
		
		System.out.println("Before concatenation:");
		System.out.printf("Queue 1: %s", queue1);
		System.out.printf("\nQueue 2: %s", queue2);
		
		queue1.concatenate(queue2);

		System.out.println("\nAfter concatenation:");
		System.out.printf("Queue 1: %s", queue1);
		System.out.printf("\nQueue 2: %s", queue2);
	}

}
