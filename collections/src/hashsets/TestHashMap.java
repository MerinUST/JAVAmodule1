package hashsets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//import  java.util.Iterator;
public class TestHashMap {
public static void main(String[] args) {
	HashMap<String,String> CountryCurr=new HashMap<>();
	CountryCurr.put("IND", "Rupe");
	CountryCurr.put("Ameri","Dollar");
	CountryCurr.put("UK", "Pound");
	CountryCurr.put(null, null);
	System.out.println(CountryCurr);//no insertion order
	System.out.println(CountryCurr.get("IND"));
	CountryCurr.put("IND", "Rupee");
	System.out.println(CountryCurr);//old value is replaced
	System.out.println(CountryCurr.size());
	System.out.println(CountryCurr.containsKey("UK"));
	//hashMap has three views
	//1.key  view
	Set<String> keys =CountryCurr.keySet();
	for(String key:keys) {
		System.out.println(keys);
	}
	//2.values view
	Collection<String> values=CountryCurr.values();
	for(String val:values) {
		System.out.println(val);
	}
	//3.key values together-ENtrySet
	Set<Entry<String,String>> entries= CountryCurr.entrySet();
	for(Entry<String,String>entry:entries) {
		System.out.println(entry);
	}
	}
}
