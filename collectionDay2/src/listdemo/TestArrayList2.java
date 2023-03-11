package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<>();//only strings can be added
		//colors.add(new Object());
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		String str=colors.get(3);//no cast operator is required.
		System.out.println(str);
		System.out.println(colors.size());
		System.out.println(colors);
		
	}

}
