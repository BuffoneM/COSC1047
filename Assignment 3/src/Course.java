/*
 * This is a class for partB1
 */

public class Course implements Cloneable {
	
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	// Search for the student and then once you find them replace their name with "nothing", and move all of the other students to the left
	public void dropStudent(String student) {
		for(int i = 0; i < students.length; i++) {
			if(students[i].equals(student)) {
				
				students[i] = "";
				numberOfStudents--;
				
				for(int j = i + 1; j < students.length; j++) {
					students[j - 1] = students[j];
				}
					
				return;
			}
		}
	}

	public Object clone() throws CloneNotSupportedException {
		Course courseClone = (Course)super.clone();
		return courseClone;
	}
}
