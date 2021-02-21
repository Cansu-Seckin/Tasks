//Author: Gulce Cansu Seckin
//Date: 04/02/2021
//Github: Cansu-Seckin

import java.util.Scanner;

public class averageGrade{
public static void main(String [] args) {
	    System.out.println("----------Grading Program----------");
//Scanner to be able to place in our results
	    Scanner console = new Scanner(System.in);
		System.out.print("First Midterm: ");
		int examgrade1 = console.nextInt();
		System.out.print("Second Midterm: ");
		int examgrade2 = console.nextInt();
		System.out.println("Final: ");
		int finalgrade=console.nextInt();

//Printing the result		
        double average = overallAverage(examgrade1,examgrade2,finalgrade);
		System.out.println("Average: " + average);
		findingGrade(average);
		}

//Calculating the average of the 3 exams
public static double overallAverage(int examgrade1, int examgrade2, int finalgrade){
		double average = (examgrade1 + examgrade2+finalgrade) / 3;
		return average;
		 }

//Criteria for the letter grade that you will be getting according to the average of the exams
public static void findingGrade(double average){
		if (average>=90){
		System.out.println("Letter Grade: A");
		}
		else if (average<90 && average>=80)
		{
	    System.out.println("Letter Grade: B");
		}
		else if (average<90 && average>=80)
		{
		System.out.println("Letter Grade: C");
		}
		else if (average<80 && average>=70)
		{
		System.out.println("Letter Grade: D");
		}
		else if (average<70)
		{
		System.out.println("Letter Grade: F");
		}
		       
}

}
