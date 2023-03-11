package hashsets;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashsets {
	public static void main(String[] args) {
		HashSet<String> bookSet= new HashSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21days");
		bookSet.add("Java for dummys");
		bookSet.add(null);
		bookSet.add(null);
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());//dont allow duplecate items
		for(String book:bookSet) {
			System.out.println(book);
		}
		System.out.println("-----------------");
		Iterator<String> iter =bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
	}
		System.out.println("-----------------");

}
}
