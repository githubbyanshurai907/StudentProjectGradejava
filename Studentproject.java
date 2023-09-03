import java.util.*;

public class Studentproject {
	static int totalMarks;
	static double average;
	String grade;

	public int calculateTotalMarks(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 | a[i] <= 100) {
				totalMarks += a[i];
			}

		}
		return totalMarks;
	}

	public double averageMarks(int a[]) {
		average = (totalMarks / a.length);
		if (average >= 0) {
			return average;
		}
		return 0.0;
	}

	public String gradeCalculation(double average) {
		if (average > 90) {
			return "A";
		} else if (average > 80) {
			return "B";
		} else if (average > 70) {
			return "C";
		} else if (average > 60) {
			return "D";
		} else {
			return "E";
		}

	}

	public void displayResult() {
		grade = gradeCalculation(average);
		System.out.println("Your Total Marks is: " + totalMarks);
		System.out.println("Your Average Percentage is: " + average + "%");
		System.out.println("Your Grade is: " + grade);
	}

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of subjects: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the " + (i+1) + " subject marks obtained(out of 100): ");
				arr[i] = sc.nextInt();

			}
			for (int i = 0; i < arr.length;i++) {
				if (arr[i] < 0 | arr[i] > 100) {
					System.out.println("Invalid Marks");
					System.out.println("Please Enter the marks in between range(0-100)");
					break;

				} else {
					Studentproject s1 = new Studentproject();
					s1.calculateTotalMarks(arr);
					s1.averageMarks(arr);
					s1.displayResult();
					break;
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Please enter the integer values");
		}

		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
