package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter number of new student you want to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		
		for(int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
//		System.out.println(students[1].toString());
//		System.out.println(students[0].toString());
//		System.out.println(students[2].toString());

	}

}
