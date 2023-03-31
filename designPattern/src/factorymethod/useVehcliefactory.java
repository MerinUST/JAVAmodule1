package factorymethod;

public class useVehcliefactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Seltos=VechicleFactory.newInstance("Seltos");
		Seltos.honk();
		Vehicle XCross=VechicleFactory.newInstance("XCross");
		XCross.move();
		

	}

}
