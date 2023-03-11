package strings;

public class classnew {
public static void main(String[] args) {
	String string=new String("welcome");
	System.out.println(string.toUpperCase());
	System.out.println(string.toLowerCase());
// string are immutable
	//"16-11-477/6/A/3 Hyderabad 500036"
	String s=new String("16-11-477//6/A/3 Hyderabad 500036");
	int c=0;
	int c1=0;
	int c2=0;
	for(int i=0;i<s.length();i++) {
		//System.out.println(Character(i));
	char ch=s.charAt(i);
	
	if(Character.isAlphabetic(ch)) {
		c++;
	}
	else if(Character.isDigit(ch)) {
		c1++;
	}
	
	else {
		c2++;
	}
}
	System.out.println("alpha"+c);
	System.out.println("num"+c1);
	System.out.println("other"+c2);
	//System.out.println(Character.isAlphabetic(i));
}
}
