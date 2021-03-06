import java.util.Scanner;

public class temperatureAnalysis {
public static void main(String [] args) {
	
	//Get the number of days, of which their temperatures should be measured
	Scanner days=new Scanner(System.in);
	System.out.println(" Enter the number of days: ");
	int numdaysconsidered=days.nextInt();
	
	//Get the temperature of those days and find their average
	//The temperatures are stored in an array
	int temperatureArray[] = new int[numdaysconsidered];    
	int sum=0;
	for(int i=0; i<numdaysconsidered;i++) {
	int n=i+1; 
	System.out.println(" The temperature of " + n + " is: ");
	temperatureArray[i]=days.nextInt();
	sum+=temperatureArray[i];
	}
	double average= (double) sum/numdaysconsidered;	
	
	//Report the average of the temperatures of those given days
	System.out.println(" The average temperature of the given days is " + average);
	
	//Find how many days are above the average
	int count=0;
	for(int i=0; i<numdaysconsidered;i++) {
	if(temperatureArray[i]>average) {
	count++;
	}
	}
	
	//Report the number of days that are above the average 
	System.out.println(" The number of days above average is " + count);
	}

}


