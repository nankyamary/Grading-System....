
public class CourseUnit {

	private String name;
	private int creditUnit;
	private int test1Mark;
	private int test2Mark;
	private int courseWorkMark;
	private int examMark;
	private String grade;
	private double gpaPerCourseUnit;
	public CourseUnit(String name, int creditUnit, int test1Mark, int test2Mark, int courseWorkMark, int examMark) {
		this.name = name;
		this.creditUnit = creditUnit;
		this.test1Mark = test1Mark;
		this.test2Mark = test2Mark;
		this.courseWorkMark = courseWorkMark;
		this.examMark = examMark;
	}

	public int getTotal() {
		int testmark;
		if(test1Mark > test2Mark)
		{
			testmark = test1Mark;
		}else if(test1Mark == test2Mark){
			testmark = test1Mark;
		}else{
			testmark = test2Mark;
		}
		
		//int Total=(testmark*0.2 + courseWorkMark*0.2 + examMark*0.6);
		return (int)(testmark*0.2 + courseWorkMark*0.2 + examMark*0.6);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditUnit() {
		return creditUnit;
	}

	public void setCreditUnit(int creditUnit) {
		this.creditUnit = creditUnit;
	}

	public int getTest1Mark() {
		return test1Mark;
	}

	public void setTest1Mark(int test1Mark) {
		this.test1Mark = test1Mark;
	}

	public int getTest2Mark() {
		return test2Mark;
	}

	public void setTest2Mark(int test2Mark) {
		this.test2Mark = test2Mark;
	}

	public int getCourseWorkMark() {
		return courseWorkMark;
	}

	public void setCourseWorkMark(int courseWorkMark) {
		this.courseWorkMark = courseWorkMark;
	}

	public int getExamMark() {
		return examMark;
	}

	public void setExamMark(int examMark) {
		this.examMark = examMark;
	}
	public String getGrade(){
		int total = getTotal();
		
		if(total<=100&&total>=80){grade="A";gpaPerCourseUnit=5.0;}
		if(total<=79&&total>=75){grade="B+";gpaPerCourseUnit=4.5;}
		if(total<=74&&total>=70){grade="B";gpaPerCourseUnit=4.0;}
		if(total<=69&&total>=65){grade="C+";gpaPerCourseUnit=3.5;}
		if(total<=64&&total>=60){grade="C";gpaPerCourseUnit=3.0;}
		if(total<=59&&total>=55){grade="D+";gpaPerCourseUnit=2.5;}
		if(total<=54&&total>=50){grade="D-";gpaPerCourseUnit=2.0;}
		if(total<=49&&total>=45){grade="E";gpaPerCourseUnit=1.5;}
		if(total<=44&&total>=40){grade="E-";gpaPerCourseUnit=1.0;}
		if(total<=39&&total>=0){grade="F";gpaPerCourseUnit=0.5;}
		
		return grade;
		
	}
	public double getGPAPerCourseUnit()
	{
		
		
		return gpaPerCourseUnit; 
	}
	public double getCourseUnitByCredit()
	{
		return getCreditUnit()*getGPAPerCourseUnit();
	}
}



