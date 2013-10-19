
public class Student {
	private String firstName;
	private String lastName;
	private String regNumber;
	private int studentNumber;

	public Student(String firstName, String lastName, String regNumber, int studentNumber) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setRegNumber(regNumber);
		this.setStudentNumber(studentNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
