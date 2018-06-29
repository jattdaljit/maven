package com.daljit;
import java.util.Scanner;
/**
 * Sort class is used to sort student
 * according to firstname and rollNo.
 * @author Daljit
 * @version 0.0.1
 */
public class Sort {
	Student[] arrObject = new Student[9];
	Scanner scanner = new Scanner(System.in); // used for input
	Student tempObject = new Student(); // used for swapping.
	Sort(Student[] arrObject) {
		this.arrObject = arrObject;
		System.out.println("Select Sorting option");
		System.out.println("1. Sort Using FirstName 2. Sort Using RollNo");
	    int option = scanner.nextInt();
	    switch (option) {
	    case 1: sortByFirstName();
	    		break;
	    case 2: sortByRollNo();
	    		break;
	    default: System.out.println("Wrong selection");
	    }
	}
	/**
	 * Used to sort student by firstName.
	 */
	public void sortByFirstName() {
		for (int i = 0; i < arrObject.length; i++) {
			for (int j = i + 1; j < arrObject.length; j++) {
				if (arrObject[i].getFirstName().compareTo(arrObject[j].getFirstName()) > 0) {
					tempObject = arrObject[i];
					arrObject[i] = arrObject[j];
					arrObject[j] = tempObject;
				}
			}
		}
		printData();
	}
	/**
	 * sortByRollNo method sort all student by rollNo.
	 */
	public void sortByRollNo() {
		for (int i = 0; i < arrObject.length; i++) {
			for (int j = i; j < arrObject.length; j++) {
				if (arrObject[i].getRollNo() > arrObject[j].getRollNo()) {
					tempObject = arrObject[i];
					arrObject[i] = arrObject[j];
					arrObject[j] = tempObject;
				}
			}
		}
		printData();
	}
	/**
	 * print student information.
	 */
	public void printData() {
		for (int index = 0; index < arrObject.length; index++) {
		System.out.println("Name: " + arrObject[index].getFirstName());
		System.out.println("Last Name: " + arrObject[index].getLastName());
		System.out.println("Roll No:" + arrObject[index].getRollNo());
		System.out.println("Department: " + arrObject[index].getDepartment());
		System.out.println("---------------------------------------------");
		}
	}
}
