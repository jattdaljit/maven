package com.daljit;

/**
 * @author Daljit
 * @version 0.0.1
 * This class tells the basic details that a student
 * object must have.
 */

public class Student {
	private String firstName; /** first name of student. */
	private String lastName; /** last name of student. */
	private int rollNo; /** roll no of particular student. */
	private String department; /** current branch of student. */
	/**
	 * @return first name of the student
	 */
	public String getFirstName() {
		return firstName;
	}
    /**
     * Set first name of student.
     * @param firstName passed as a parameter.
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return last name of a particular student.
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Sets last name of student.
	 * @param lastName passed as a parameter
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return rollNo of a particular student.
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * Set roll no of a student.
	 * @param rollNo passed as a parameter.
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return department of a particular student.
	 */
	public String getDepartment() {
		return department;
	}
    /**
     * The method setDepartment is used to set branch of particular student.
     * @param department argument passed to set particular branch.
     */
	public void setDepartment(String department) {
		this.department = department;
	}
}
