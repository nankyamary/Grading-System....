package realGrade;

import java.util.Scanner;

public class GradeYourself {

	// private static final int NumberOfCourseUnits = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int courseUnitTotal;

		// String[] CourseUnitNames = new String [courseUnitTotal];
		// int[] test1Mark = new int[courseUnitTotal];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Number of Course Units:\n");
		courseUnitTotal = input.nextInt();

		String[] CourseUnitNames = new String[courseUnitTotal];
		int[] test1Mark = new int[courseUnitTotal];
		int[] creditUnit = new int[courseUnitTotal];
		int check = 0;

		while (check < courseUnitTotal) {
			for (int i = 0; i < courseUnitTotal; i++) {
				System.out.println("Enter the Course Unit names");
				input.nextLine();
				CourseUnitNames[i] = input.nextLine();

				break;
			}
			
			for (int j = 0; j < courseUnitTotal; j++) {


				System.out.print("Enter the Test1Mark:\n");
				test1Mark[j] = input.nextInt();
				break;
			}

			for (int k = 0; k < courseUnitTotal; k++) {
				System.out.println("Enter the Credit Unit ");
				input.nextLine();
				creditUnit[k] = input.nextInt();

			
			}
		
			check = check + 1;
		}
	}

}
