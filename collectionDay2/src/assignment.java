import java.util.Collection;
import java.util.HashMap;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String st=new String("This this class consists exclusively of static methods that .operate on or return collections. It contains polymorphic algorithms that operate on collections, \"wrappers\", which return a new collection backed by a specified collection, and a few other odds and ends.");
		String str=st.toLowerCase(); 
		String words[]=str.split(" ");
		 HashMap<String,Integer> mapping =new HashMap<>(); 
		//
		 //mapping.put(str, null)
		
			 
		 
		for(int i=0;i<words.length;i++) {
			Integer integer=mapping.get(words[i]);
			if(integer!=null) {
				//mapping.put(words[i], 1);
				mapping.put(words[i], integer+1);
			}
			else {
				//mapping.put(words[i], integer+1);
				mapping.put(words[i], 1);
			}
			
			
		}
		 
		System.out.println(mapping);
	}

}
