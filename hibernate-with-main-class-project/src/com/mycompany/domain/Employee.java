/**
 * 
 */
package com.mycompany.domain;

/**
 * @author Hari Somagatta
 *
 */
public class Employee {
	
	
	private int idEmployee;  
	private String FirstName,lastName,middleName; 
	private int salary, depId;
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", FirstName=" + FirstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", salary=" + salary + ", depId=" + depId + "]";
	}
	
	

}
