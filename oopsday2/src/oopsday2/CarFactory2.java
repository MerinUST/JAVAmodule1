package oopsday2;

public class CarFactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CarIface car =new CarIface();
		// CarIface car;    // not refering to any object
		CarIface car =new Car(5000,500,0,false);
		car.start();
		car.honk();
		car.moove(); 
		car.stop();
		 
		

	}

}
