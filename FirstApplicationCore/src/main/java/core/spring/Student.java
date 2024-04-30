package core.spring;

public class Student {

	private int StudentId;
	private String studentName;
	private String studentAddress;

	
	public Student() {
		super();

	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting student id");
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting studentName");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting student Address");
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
