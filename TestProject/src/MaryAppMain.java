import java.util.*;
public class MaryAppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaryApp maryApp = new MaryApp();
Scanner input=new Scanner(System.in);
int option;
      menu();
     option = input.nextInt();
 while(option != 0){
        maryApp.register(option);
        menu();
        option = input.nextInt();
        
 }
	}
	public static void menu()
 	{
	 System.out.println("1: Create Student");
	 System.out.println("2: Add Course Unit");
	 System.out.println("3: Register Semester");
	 System.out.println("4: Show Results");
	 System.out.println("0: Exit");
 	}
}
