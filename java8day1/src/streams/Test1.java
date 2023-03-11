package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList();
		list.add("sun");
		list.add("moon");
		list.add("Jupiter");
		list.add("uranus");
		list.add("pluto");
		list.add("mars");
		list.add("venus");
		Predicate <String> p= (str)->{
			return (str.length()>3||str.length()<10);};
		long count=list.stream()
				.filter(p)
				.count();//implicit navigation
		System.out.println(count);
		
		Function<String, String> f=(str)->{
			return str.toUpperCase();
			
		};
	
	List <String> outList= list.stream()
			.map((str)->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(outList);
		Consumer<String> c=(str)->{
			System.out.println(str);
		};
	list.stream().forEach(System.out::println);//terminal operator-consumers
	
	list.stream().filter(p).map(f).forEach(c);
	}
	

}
