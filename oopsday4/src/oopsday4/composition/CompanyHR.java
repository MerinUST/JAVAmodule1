package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address  resadd =new Address("31","Mannath","Worli","Mumbai",4000344);
		Address commdd=new Address("32","Antela","Bandra","Mumbai",29375647);
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 30000,resadd,commdd);
		System.out.println(emp1);
		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 35000,resadd,commdd);
		System.out.println(emp2);
		Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "Research", 40000,resadd,commdd);
		System.out.println(emp3);
		Employee emp4 = new Employee("Jones Doe", "Male", 23, 104, "Resaerch", 40000,resadd,commdd);
		System.out.println(emp4);
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 30000,resadd,commdd);
		System.out.println(emp5);
		
		if(emp1.equals(emp5)) {//checks the hashcode
			System.out.println("the objects are same");
		}
		else {
			System.out.println("not equal");
		}
		
	}

}
