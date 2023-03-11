package FunctionalInterface;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class predicateTest {

	public static void main(String[] args) {
		List<String> string=Arrays.asList("Andhra pradesh","TamilNadu","Telingana","Kerala","Karnataka");
		
		Predicate<String> p=(String str)->{
			return str.length()>10;
		};
		longString(string,p);
	}
		public static void longString(List<String> strings,Predicate<String> p) {
			for(String str:strings) {
				System.out.println(p.test(str));
			}

}
}
