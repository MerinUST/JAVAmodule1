package oopsday1.withbusinessmethods;

public class CarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Car jag = new Car("yellow",6000000,"toyota","innova"); 
		  jag.start();
		  jag.changeGear(1);
		  jag.stop();
		  
		  
		 // jag.setColor("red");
		  //jag.setBrand("jaguar");
		  //jag.setModel("sedan");
		  //jag.setPrice(300000);
		  
			/*
			 * System.out.println(jag.hashCode());
			 * System.out.println(Integer.toHexString(jag.hashCode()));
			 * System.out.println(jag);
			 */
			/*
			 * System.out.println(jag.getColor()); System.out.println(jag.getBrand());
			 * System.out.println(jag.getModel()); System.out.println(jag.getPrice());
			 */
			/*
			 * car.color = "Blue"; car.price = 6000000; car.brand="Jaguar";
			 * car.model="Highend sedan"; System.out.println(car.color);
			 * System.out.println(car.price); System.out.println(car.brand);
			 * System.out.println(car.model);
			 */
		  Car bmw =new Car("brown",986545789,"bmw","sports suv");
		  bmw.start();
		  bmw.changeGear(2);
		  bmw.stop();
			/*
			 * Car bmw =new Car("brown",986545789,"bmw","sports suv");
			 * bmw.setColor("white"); bmw.setBrand("bmw"); bmw.setModel("suv");
			 * bmw.setPrice(5000000); System.out.println(bmw.getBrand());
			 * System.out.println(bmw.getColor()); System.out.println(bmw.getModel());
			 * System.out.println(bmw.getPrice());
			 */
		/*
		 * bmw.color="yellow"; bmw.brand="BMW"; bmw.model="SUV"; bmw.price=2;
		 * System.out.println(bmw.color); System.out.println(bmw.price);
		 * System.out.println(bmw.brand); System.out.println(bmw.model);
		 */
		
	}

}
