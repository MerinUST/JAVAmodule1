package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		List<String> string=Arrays.asList("Andhra pradesh","TamilNadu","Telingana","Kerala","Karnataka");
		Supplier<String> supplier=()->{
			return new String("Hola!");
		};
			System.out.println(supplier.get());
	}
}
