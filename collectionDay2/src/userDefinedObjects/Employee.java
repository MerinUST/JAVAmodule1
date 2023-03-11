package userDefinedObjects;

import java.util.Objects;

public class Employee extends Person implements Comparable {
	private long empId;
	private String deptno;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String gender, int age,long empId, String deptno,double salary) {
		super(name, gender, age);
		this.empId=empId;
		this.deptno=deptno;
		this.salary=salary;//reusing the members
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", Name" + getName()
				+ ", Gender" + getGender() + ", Age=" + getAge() + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deptno, empId, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empId == other.empId
		  		&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee ref =null;
		if(o!=null) {
			ref = (Employee) o;
			
		}
		if(this.empId<ref.getEmpId()) {//for ascending order -1,decending order 1
			return -1;}
		else if(this.empId>ref.getEmpId()) {
			return 1;}
		else {
		return 0;
		}
		
	}

}
