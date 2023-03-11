package listdemo;
import java.util.TreeSet;
import java.util.Iterator;

public class TestTreesets {//sorts 
	public static void main(String[] args) {
		TreeSet<String> bookSet= new TreeSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21days");
		bookSet.add("Java for dummys");
		//bookSet.add(null);
		//treeset doesnot allows null values
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());//don't allow duplicate items
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
