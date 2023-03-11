import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayQueue {
	public static void main(String[] args) {
		ArrayDeque<String> queue=new ArrayDeque<>();
		queue.addLast("First");
		queue.addLast("Second");
		queue.addLast("Third");
		queue.addLast("Fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		String element=queue.peek();//to get the element
		//String element=queue.getFirst();//removes the first element after getting it
		System.out.println(element);
		
		queue.poll();
		System.out.println(queue);
		
		Iterator<String> iter=queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		 
		
	}

}
