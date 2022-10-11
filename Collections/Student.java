package Ex2;

public class Student {
	
	//create variables
	String Name;
	int studentId;
	double GPA;
	
	////create parameterize constructor
	public Student(int studentId, double GPA, String Name){
		this.studentId = studentId;
		this.GPA = GPA;
		this.Name = Name;
	}

	//create getters and setters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	
}