package com.daljit;
import java.util.Scanner;
/**
 * This class is used to search for a particular
 * student based on different values.
 * @author Daljit
 * @version 0.0.1
 */
public class Search {
	int n = 9; // array size
	private Student[] arrObject = new Student[n];
	private Scanner scanner = new Scanner(System.in); // for input purpose
	private int flag = 0; // used for searching.
	/**
	 * constructor for class
	 * @param arrObject passed from StudentManagement
	 * contains array of objects.
	 */
	Search(final Student[] arrObject) {
		this.arrObject = arrObject;
		System.out.println("Select search Options");
		System.out.println("1. By First Name\n2. By Last Name");
		System.out.println("3. By Roll No\n4. By Department");
		int option = scanner.nextInt();
		switch (option) {
		case 1 : searchByFirstName();
			     break;
		case 2 : searchByLastName();
			     break;
		case 3 : searchByRollNo();
				 break;
		case 4 : searchByDepartment();
				 break;
		default: System.out.println("Wrong selection");
		}
	}
	/**
	 * used to search for student by first name.
	 */
	public void searchByFirstName() {
		System.out.println("Enter the First Name of Student");
		String firstName = scanner.next();
		for (int i = 0; i < arrObject.length; i++) {
			if (arrObject[i].getFirstName().equals(firstName)) {
			printData(i);
			flag = 1;
			break;
			}
		}
		if (flag == 0) {
			System.out.println("No matching record found");
		}
	}
	/**
	 * used to search for student by lastname.
	 */
	public void searchByLastName() {
		System.out.println("Enter the Last Name of Student");
		String lastName = scanner.next();
		for (int i = 0; i < arrObject.length; i++) {
			if (arrObject[i].getLastName().equals(lastName)) {
			printData(i);
			flag = 1;
			break;
			}
		}
		if (flag == 0) {
			System.out.println("No matching record found");
		}
	}
	/**
	 * used to search for student by roll number.
	 */
	public void searchByRollNo() {
		System.out.println("Enter the roll number of Student");
		int rollNo = scanner.nextInt();
		for (int i = 0; i < arrObject.length; i++) {
				if (arrObject[i].getRollNo() == rollNo) {
				printData(i);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("No matching record found");
		}
	}
	/**
	 * used to search for student by department.
	 */
	public void searchByDepartment() {
		System.out.println("Enter the department of Student");
		String department = scanner.next();
		for (int i = 0; i < arrObject.length; i++) {
			if (arrObject[i].getDepartment().equals(department)) {
			printData(i);
			flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No matching record found");
		}
	}
	/**
	 * print student information.
	 * @param index used for particular object in array.
	 */
	public void printData(final int index) {
		System.out.println("Name: " + arrObject[index].getFirstName());
		System.out.println("Last Name: " + arrObject[index].getLastName());
		System.out.println("Roll No:" + arrObject[index].getRollNo());
		System.out.println("Department: " + arrObject[index].getDepartment());
		System.out.println("---------------------------------------------");
	}
}
