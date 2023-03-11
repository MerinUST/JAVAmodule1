package optional;

import java.util.Optional;

public class TestOptional {//whithout using null keyword test for null.so no null pointer exception
public static void main(String[] args) {
	String str=null;//not instantiated
	String str2="hello";
	//Optional<String> optinal= Optional.of(str);
	//System.out.println(optinal.get());
	Optional<String> optinal2=Optional.ofNullable(str2);
	if(optinal2.isPresent())//if str is passed the true condition is executed, exception comes
	System.out.println("Value is present"+optinal2.get());
	else
		System.out.println("its null"+optinal2.orElse("String is not initialized"));
	
}
}
