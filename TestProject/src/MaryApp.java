import java.util.ArrayList;
import java.util.Scanner;


 public class MaryApp {
 private ArrayList<CourseUnit> courseUnits;
 private  Student student;
 private Form forms;
 private Semester semester;
 
 
 public MaryApp (){
	 courseUnits = new ArrayList<CourseUnit>();
	 forms =new Form();
 }
 public void registerStudent(){
	 student = forms.studentForm();
 }
 
 
 public void createCourseUnit(){
	 courseUnits.add(forms.courseunitForm());
 }
 public void createSemester(){
	 semester = new Semester(1,student,courseUnits);
 }
 
 
 public void register(int option){
	 
	 switch(option)
	 {
	 case 1:{registerStudent(); break;}
	 case 2:{createCourseUnit();break;}
	 case 3:{createSemester();break;}
	 case 4:{semester.showResults();break;}
	 default:{
		 System.out.println("Wrong Input");
		 break;
	 }
	 }
	 
 }
}
