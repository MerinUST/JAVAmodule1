import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("marker");
		list.add("Pencil");
		list.add("book");
		list.add("eraser");
		list.add("Sharpner");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2,"Sticky notes");
		System.out.println(list);
		Iterator<String> iter=list.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		ListIterator<String> listIiter= list.listIterator();
		while(listIiter.hasNext()) {
			System.out.println(listIiter.next());
			
		}
		ListIterator<String> listiter= list.listIterator();
		while(listiter.hasNext()) {
			String element=listiter.next();
			if(element.equals("Pencil")) {
				listiter.remove();
			}
			System.out.println(list);
			
		}
		
	}

}
