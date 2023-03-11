package oopsday1;

public class CarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.color = "Blue";
		car.price = 6000000;
		car.brand="Jaguar";
		car.model="Highend sedan";
		System.out.println(car.color);
		System.out.println(car.price);
		System.out.println(car.brand);
		System.out.println(car.model);
		
		Car bmw =new Car();
		bmw.color="yellow";
		bmw.brand="BMW";
		bmw.model="SUV";
		bmw.price=2;
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
		
	}

}
