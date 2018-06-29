package com.daljit;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/**
 * @author Daljit
 * This class contain the main method and
 * Menu for selecting search or sort option.
 */
public class StudentManagement {
	/**
	 * Main method to load file and create objects of student class.
	 * @param args Used for runtime arguments.
	 * @throws FileNotFoundException if file doesn't exist.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		final int n = 9;
		// Path to CSV file
		String filePath = "src/main/resources/data.csv";
		Scanner scanner = new Scanner(new File(filePath));
		scanner.useDelimiter(",");
		// array of object for student class
		Student[] arrObject = new Student[n];
        for (int i = 0; i < n; i++) {
        	arrObject[i] = new Student();
        }
        int i = 0; // i is used for incremental purpose.
		while (scanner.hasNext()) {
			arrObject[i].setFirstName(scanner.next());
            arrObject[i].setLastName(scanner.next());
            int temp = Integer.parseInt(scanner.next()); // converting string to int
            arrObject[i].setRollNo(temp);
            arrObject[i].setDepartment(scanner.next());
            i++;
        }
        scanner.close();
        System.out.println("Select option\n1. Search\n2. Sort");
        Scanner sc = new Scanner(System.in); // for taking input
        int option = sc.nextInt();
        switch (option) {
        case 1 : new Search(arrObject);
        		 break;
        case 2 : new Sort(arrObject);
        		 break;
        default : System.out.println("Wrong option Selected");
        }
        sc.close();
	}
}
