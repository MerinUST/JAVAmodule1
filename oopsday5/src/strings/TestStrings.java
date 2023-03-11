package strings;

public class TestStrings {
	
	public static void main(String[] args) {
		byte bytes[]= {65,66,67,68,69};

		 String str=new String(bytes);//string can be converted to bytes
		 System.out.println(str.length());
		 System.out.println(str);
		 str="Welcome to UST Global";
		 bytes=str.getBytes();
		 for(byte b:bytes) {
			 System.out.println(b);
		 }
		 char chars[]= {'U','S','T',' ','G'};
		 str=new String(chars);
		 System.out.println(str);
		 str.getChars(0, chars.length, chars, 0);
		 for(char c:chars) {
			 System.out.println(c);
		 }
		// integer i =new Integer(8);//deprecated
		 str="She sells sea shells . in   sea   shore";
		 int c=0;
		 for(int i=0;i<str.length();i++) {
			 if('s'==str.charAt(i)|'S'==str.charAt(i))
			 c++;
			 //else if('S'==str.charAt(i))
				// c++;
		 }
		 System.out.println(c);
		 String words[]=str.split("[.]");
		 for(String word:words) {
			 System.out.println(word);
		 }
		 System.out.println(words.length);
		 str =new String("Cartoon");
		 System.out.println(str.startsWith("Car"));
		 System.out.println(str.endsWith("on"));
		 int apos=str.indexOf('a');
		 int tpos=str.indexOf('t');
		 String string2=str.substring(apos,tpos+1);
		 System.out.println(string2);
		 string2=str.substring(tpos);
		 System.out.println(string2);
		 str=new String("MADAMAM");
		 int mpos=-1;
		 int dpos=str.lastIndexOf('d');
		 System.out.println(dpos);
		 string2=str.substring(dpos,str.length());
		 System.out.println(string2);
		 String email=new String("aneeta.roy@ust.com");
		 dpos=email.lastIndexOf('c');
		 System.out.println(dpos);
		 string2=email.substring(dpos,email.length());
		 System.out.println(string2);
		 String s1=new String("welcome");
		 String s2 =new String("welcome");
		 boolean result=s1.equals(s2);
		 System.out.println(result);
		 result=s1.equalsIgnoreCase(s2);
		 System.out.println(result);
		 int val=s2.compareTo(s1);//to compare whether the strings are same
		 System.out.println(val);
		 System.out.println(str.toLowerCase());
		 System.out.println(str);
		 
	}
	

}