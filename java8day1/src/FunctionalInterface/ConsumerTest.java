package FunctionalInterface;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> string=Arrays.asList("Andhra pradesh","TamilNadu","Telingana","Kerala","Karnataka");
		Consumer<String> consumer=(str)->{
		System.out.println(str);//nothing to return. they will be consumed	
		//only input is taken .
	};
	consumer.accept("I am doing great");
	/*for(String str:string) {
		consumer.accept(str);
	}*/
	printString(string,consumer );
}
	public static void printString(List<String> string,Consumer<String> c) {
		for(String str:string) {
			c.accept(str);
		}
	}
}
