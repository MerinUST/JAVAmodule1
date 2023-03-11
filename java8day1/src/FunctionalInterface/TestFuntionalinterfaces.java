  package FunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFuntionalinterfaces {

	public static void main(String[] args) {
		List<String> string=Arrays.asList("Andhra","TamilNadu","Telingana","Kerala","Karnataka");
		
		
		Function <String,Integer> f =(str)->{
			return str.length();
	};
	for(String str:string) {
		System.out.println(f.apply(str));//on multiple strings
	}
	System.out.println(f.apply("Buneos dias"));
	
	Function<Integer,Integer> f2=(n)->{
	return n*n;
	};
	System.out.println(f2.apply(25));
	
	Function<String,String> f3=(str)->{
		return str.toLowerCase();
	};
	System.out.println(f3.apply("kulathoor ust global"));
}
}