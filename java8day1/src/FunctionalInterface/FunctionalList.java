package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalList {
	public static void main(String[] args) {
		List<String> string=Arrays.asList("Andhra","TamilNadu","Telingana","Kerala","Karnataka");
		
		
		Function <String,Integer> f =(str)->{
			return str.length();
	};
	
	//---------------------------------------
	Function <String,String> f1 =(str)->{
		return str.toLowerCase();
};
//--------------------------------------------
Function <String,String> f2 =(str)->{
	return str.toUpperCase();
};
//---------------------------------------------
//StringBuilder str=new StringBuilder();
Function <String,String> f3 =(str)->{
	StringBuilder str1=new StringBuilder(str);
	
	str1.reverse();
	
	return((str1.toString()));
	
	
};
	printLength(string,f);
	uppercase(string,f1);
	lowercase(string,f2);
	reverse(string,f3);
	}
	
	
	
	
	//-------------------------------------------------------------
public static void printLength(List<String> string,Function<String,Integer> fRef) {
	for(String str:string) {
		System.out.println(fRef.apply(str));
	}

}
public static void uppercase(List<String> string,Function<String,String>fRef2) {
	for(String str:string) {
		System.out.println(fRef2.apply(str));
	}
}
public static void lowercase(List<String> string,Function<String,String>fRef3) {
	for(String str:string) {
		System.out.println(fRef3.apply(str));
	}
}
public static void reverse(List<String> string,Function<String,String>fRef4) {
	for(String str:string) {
		System.out.println(fRef4.apply(str));
	}
}
}
