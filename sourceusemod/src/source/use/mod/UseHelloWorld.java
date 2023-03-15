package source.use.mod;
import source.mod.helloWorld;
public class UseHelloWorld {
	public static void main(String[] args) {
		var x="anil";
		var y=30.4;
		var z='c';
		System.out.println(x.length());
				
		

	try {
		helloWorld world=new helloWorld() ;
		world.message();
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}