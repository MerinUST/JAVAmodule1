package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList flowers =new ArrayList();
		flowers.add(new Integer("1")); 
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));
		System.out.println(flowers);
		flowers.add("Tulips");//added to the end
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Lilly");
		flowers.add("cosmos");
 
		System.out.println(flowers);
		System.out.println(flowers.size());//length
		System.out.println(flowers.get(2));// to get an object
		System.out.println(flowers.contains("lilly"));//get true or false
		flowers.add(2,"Sunflower");
		flowers.remove(2);//to delete
		System.out.println("----First way of printing-----");
		Object obj=flowers.get(2);
		 
		 if(obj instanceof Integer) {
			 Integer in=(Integer)obj;
			 System.out.println(in.MIN_VALUE);
	}
		 else if(obj instanceof Double) {
			 Double d=(Double)obj;
			 System.out.println(d.MAX_VALUE);
			 
		 }
		 else if(obj instanceof String) {
			 String st=(String)obj;
			 System.out.println(st.toUpperCase());
		 }
		 
		/*for(Object obj:flowers)
			
		{
			System.out.println(obj);//to traverse over collections
		}
		System.out.println("----second way of printing-----");
		Iterator iter =flowers.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		} 
		System.out.println("----third way of printing-----");
		for(int i=0;i<flowers.size();i++) {
			System.out.println(flowers.get(i));
		}
		String str=(String) flowers.get(3);// to convrt to string
		*/
	}

}
