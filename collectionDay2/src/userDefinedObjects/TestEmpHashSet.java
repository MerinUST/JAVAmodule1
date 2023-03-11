package userDefinedObjects;
import java.util.ArrayList;
import java.util.HashSet;
public class TestEmpHashSet {
	

	//import oopsday4.inheritance.Employee;

	
		public static void main(String[] args) {
			HashSet<Employee> empSet=new HashSet<Employee>();// employee type
			
			Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 30000);
			
			Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 35000);
			
			Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "Research", 40000);
			
			Employee emp4 = new Employee("Jones Doe", "Male", 23, 104, "Resaerch", 40000);
			
			Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 30000);
			empSet.add(emp1);
			empSet.add(emp2);
			empSet.add(emp3);
			empSet.add(emp4);
			empSet.add(emp5);
			
			System.out.println(empSet);
			}

	

}
