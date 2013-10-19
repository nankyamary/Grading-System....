package realGrade;

import java.util.Scanner;

public class Test {
	private String[] CourseUnitNames;
	private int[] creditUnit;
	private int[] test1Mark;
	private int[] test2Mark;
	private int[] examMark;
	private int[] courseWorkMark;
	private int courseUnitTotal;
	private Scanner input;

	public static void main(String[] args) {

		Test mainApplication = new Test();
		// mainApplication.getDetails();
		mainApplication.menu();
	}

	public void getDetails() {

		input = new Scanner(System.in);

		System.out.println("Enter the Number of Course Units11:\n");
		courseUnitTotal = input.nextInt();

		CourseUnitNames = new String[courseUnitTotal];
		creditUnit = new int[courseUnitTotal];
		test1Mark = new int[courseUnitTotal];
		test2Mark = new int[courseUnitTotal];
		examMark = new int[courseUnitTotal];
		courseWorkMark = new int[courseUnitTotal];
		for (int i = 0; i < courseUnitTotal; i++) {

			System.out.println("Enter the Course Unit name:");
			input.nextLine();
			CourseUnitNames[i] = input.nextLine();

			System.out.println("Enter the Credit Unit: ");
			creditUnit[i] = input.nextInt();

			System.out.print("Enter the Test1 Mark:\n");
			test1Mark[i] = input.nextInt();

			System.out.print("Enter the Test2 Mark:\n");
			test2Mark[i] = input.nextInt();

			System.out.print("Enter the Course Work Mark:\n");
			courseWorkMark[i] = input.nextInt();

			System.out.print("Enter the Exam Mark:\n");
			examMark[i] = input.nextInt();
		}
	}

	public int compareTests(int test1Mark, int test2Mark) {
		if (test1Mark > test2Mark) {
			return test1Mark;
		} else {
			return test2Mark;
		}
	}

	public double computeFinalCourseWorkMark(int courseWorkMark, int test1Mark,
			int test2Mark) {
		int largeTestMark = compareTests(test1Mark, test2Mark);
		double finalCourseWork = ((largeTestMark + courseWorkMark) * 0.2);

		return finalCourseWork;
	}

	public double computeOveralMark(int courseWorkMark, int test1Mark,
			int test2Mark, double examMark) {

		double finalCourseWorkMark = computeFinalCourseWorkMark(courseWorkMark,
				test1Mark, test2Mark);

		double overalMark = (finalCourseWorkMark + (examMark * 0.6));
		return overalMark;
	}

	public double getGrade(double overalMark) {

		if (overalMark <= 100 && overalMark >= 80) {
			return 5.0;
		} else if (overalMark <= 79 && overalMark >= 75) {

			return 4.5;
		} else if (overalMark <= 74 && overalMark >= 70) {

			return 4.0;
		} else if (overalMark <= 69 && overalMark >= 65) {

			return 3.5;
		} else if (overalMark <= 64 && overalMark >= 60) {

			return 3.0;
		} else if (overalMark <= 59 && overalMark >= 55) {

			return 2.5;
		} else if (overalMark <= 54 && overalMark >= 50) {

			return 2.0;
		} else if (overalMark <= 49 && overalMark >= 45) {

			return 1.5;
		} else if (overalMark <= 44 && overalMark >= 40) {

			return 1.0;
		} else {
			return 0.5;
		}
	}

	public void menu() {
		System.out.println("Enter 1 to input Details.");
		System.out.println("Enter 2 to Calculate CGPA.");
		System.out.println("Enter 3 to Display Menu. ");
		System.out.println("Enter 4 to Compute overal CGPA.");
		System.out.println("Enter 5 to Exit.");
		input = new Scanner(System.in);
		int choice = input.nextInt();

		if (choice == 1) {
			getDetails();
			menu();
		} else if (choice == 2) {
			computeEveryThing();
			menu();
		} else if (choice == 3) {
			menu();
		} else if (choice == 4) {
			computeCGPA();
			menu();
		} else if (choice == 5) {
			System.exit(1);
		}
	}

	public void computeEveryThing() {

		System.out.printf("\t\t%s\t\t%s\t\t%s", "Course Unit", "Overal Mark",
				"GPA");
		System.out.println("\n");
		for (int counter = 0; counter < courseUnitTotal; counter++) {

			double overalMark = computeOveralMark(courseWorkMark[counter],
					test1Mark[counter], test2Mark[counter], examMark[counter]);

			double gpa = getGrade(overalMark);
			System.out.printf("\t\t%s\t\t%f\t\t%f", CourseUnitNames[counter],
					overalMark, gpa);
			System.out.println();
		}
	}

	public void computeCGPA() {

		System.out.println("\n\n");
		System.out.printf("Computing CGPA");

		double totalGPA = 0.0;
		double totalCU = 0.0;
		for (int counter = 0; counter < courseUnitTotal; counter++) {

			double overalMark = computeOveralMark(courseWorkMark[counter],
					test1Mark[counter], test2Mark[counter], examMark[counter]);

			double gpa = getGrade(overalMark);

			totalGPA = totalGPA + (gpa * creditUnit[counter]);

			totalCU = totalCU + creditUnit[counter];
		}

		System.out.println("CGPA:  " + (totalGPA / totalCU));
	}
}

/*
 * public int getTotal(int[] test1Mark, int [] test2Mark, int []
 * courseWorkMark,int []examMark) { int totalMark; int testMark;
 * 
 * totalMark=(testMark*0.2 + courseWorkMark*0.2 + examMark*0.6); { return
 * totalMark }
 * 
 * }}
 */
