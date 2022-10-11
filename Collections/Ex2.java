package Ex2;

import java.util.ArrayList;
import java.util.List;


public class Collections {

	public static void main(String[] args) {
		//List<datatype> listName = new ArrayList<datatype>
		List<Student> StudentList = new ArrayList<>();
		
		//create 3 student objects
		StudentList.add(new Student(101,2.5,"Asha"));
		StudentList.add(new Student(102,5.5,"Vinura"));
		StudentList.add(new Student(103,6.2,"Nuwan"));
		
		for(Student s : StudentList){
			System.out.println("Student ID: " + s.getStudentId());
			System.out.println("Student Name: " + s.getName());
			System.out.println("Student GPA: " +s.getGPA());
			System.out.println();//to leave a break
		}
	}
}
