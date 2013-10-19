import java.util.*;
public class Form {
	private  Scanner input;
	private String firstName;
	private String lastName;
	private String regNumber;
	private int studentNumber;
	
	
	private String courseUnitName;
	private int creditUnit;
	private int test1Mark;
	private int test2Mark;
	private int courseWorkMark;
	private int examMark;
	
	
	public Form()
	{
		input = new Scanner(System.in);
	}
	public Student studentForm()
	{
		System.out.println("Enter firstName ");
		firstName=input.nextLine();
		
		System.out.println("Enter lastName");
		lastName=input.nextLine();
		
		System.out.println("Enter regNumber");
		regNumber=input.nextLine();
		
		System.out.println("Enter studentNumber ");
		studentNumber=input.nextInt();
		return new Student(firstName,lastName,regNumber,studentNumber);
	} 
	public CourseUnit courseunitForm (){
		System.out.println("Enter courseUnitName");
		courseUnitName=input.nextLine();
		input.nextLine();
		System.out.println("Enter creditUnit");
		creditUnit=input.nextInt();
		
		System.out.println("Enter testMark1");
		test1Mark=input.nextInt();
		
		System.out.println("Enter test2Mark");
		test2Mark=input.nextInt();
		
		System.out.println("Enter courseWorkMark");
		courseWorkMark=input.nextInt();
		
		System.out.println("Enter examMark");
		examMark=input.nextInt();
		
		
		
		return new CourseUnit( courseUnitName,creditUnit,test1Mark, test2Mark, examMark,courseWorkMark);
		
		
		
		
	}
	
	
	
	

}