import java.util.ArrayList;
import java.util.ListIterator;


public class Semester {
    private int semesterNumber;
	private Student student;
	private ArrayList<CourseUnit> courseunits;
	public Semester(int semesterNumber ,Student student,ArrayList<CourseUnit> courseunits)
	{   this.semesterNumber = semesterNumber;
		this.setCourseunits(courseunits);
		this.setStudent(student);	
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public ArrayList<CourseUnit> getCourseunits() {
		return courseunits;
	}
	public void setCourseunits(ArrayList<CourseUnit> courseunits) {
		this.courseunits = courseunits;
		
		}
	public double calculateGPA(){
		
		ListIterator<CourseUnit> courseUnitIter = courseunits.listIterator();
		double totalGPA = 0;
		double totalGPAPerCourseUnitByCredit = 0;
		while(courseUnitIter.hasNext())
		{
			CourseUnit tempCourseUnit = (CourseUnit)courseUnitIter.next();
			totalGPAPerCourseUnitByCredit += tempCourseUnit.getCourseUnitByCredit();
			
			totalGPA +=tempCourseUnit.getCreditUnit();
			
		}
		
		
		 return (totalGPAPerCourseUnitByCredit/totalGPA);
		
		
	}
	
	public void showResults(){
		ListIterator<CourseUnit> courseUnitIter = courseunits.listIterator();
		System.out.println("[COURSE UNIT|TEST1|TEST2|COURSEWORK|EXAM]");
		while(courseUnitIter.hasNext())
		{
			CourseUnit tempCourseUnit = (CourseUnit)courseUnitIter.next();
			System.out.printf("%s %d %d %d %d\n",tempCourseUnit.getName(),
					tempCourseUnit.getTest1Mark(),
					tempCourseUnit.getTest2Mark(),
					tempCourseUnit.getCourseWorkMark()
					,tempCourseUnit.getExamMark());
			
		}
		System.out.printf("GPA IS %f\n",calculateGPA());
		
}
	
}
