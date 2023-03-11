package userDefinedObjects;

import java.util.ArrayList;

//import oopsday4.inheritance.Employee;

public class TestEmpArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();// employee type
		
		Employee emp1 = new Employee("John Doe", "Male", 24, 101, "Research", 30000);
		
		Employee emp2 = new Employee("Jane Doe", "Female", 23, 102, "Accounting", 35000);
		
		Employee emp3 = new Employee("Jason Doe", "Male", 28, 103, "Research", 40000);
		
		Employee emp4 = new Employee("Jones Doe", "Male", 23, 104, "Resaerch", 40000);
		
		Employee emp5 = new Employee("John Doe", "Male", 24, 101, "Research", 30000);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		}

}
