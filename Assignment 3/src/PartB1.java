/*
 *	Michael Buffone 
 * 	2/1/2019
 * 	COSC1047W19
 * 	Assignment 3 Question B1 (13.13 pg 537)
 * 	This program will demonstrate the clone() method using the course class
 */

import java.util.Arrays;

public class PartB1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course course = new Course("Compsci");
		Course courseClone = (Course)course.clone();
		
		System.out.println("Do the two course objects have the same address in memory? " + (course == courseClone) + "\nProof:");
		System.out.println(course);
		System.out.println(courseClone);
		
		course.addStudent("a");
		course.addStudent("b");
		course.addStudent("c");
		course.addStudent("d");
		course.addStudent("e");
		course.addStudent("f");
		course.addStudent("g");
		course.addStudent("h");
		course.addStudent("i");
		course.addStudent("j");
		course.addStudent("k");
		course.addStudent("l");
		course.addStudent("m");
		
		System.out.println(Arrays.toString(course.getStudents()));
		course.dropStudent("e");
		System.out.println(Arrays.toString(course.getStudents()));

		
	}

}
