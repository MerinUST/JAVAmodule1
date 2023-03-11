package userDefinedObjects;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Employee> treeset=new TreeSet<Employee>();// employee type
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 30000);
		
		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 35000);
		
		Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "Research", 40000);
		
		Employee emp4 = new Employee("Jones Doe", "Male", 23, 104, "Resaerch", 40000);
		
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 30000);
		treeset.add(emp1);
		treeset.add(emp2);
		treeset.add(emp3);
		treeset.add(emp4);
		treeset.add(emp5);
		
		System.out.println(treeset);

	}

}
