package FunctionalInterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class biConsumerTest {
public static void main(String[] args) {
	HashMap<String,String> map=new HashMap<>();
	map.put("ola", "o");
	map.put("Hello", "H");
	map.put("Chao", "C");
	map.forEach((k,v)->
	System.out.println(k+"For"+v));//it takes 2 input
	BiConsumer<String,String>bi=
			(k,v)->System.out.println(k+"For"+v);
			map.forEach(bi);
}
}
