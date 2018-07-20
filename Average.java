import java.util.*;

class Average{
	public static void main(String[] args){
		int total = 0;

		int grade;
		int average;
		int counter = 0;
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter 10 nos");
	while(counter < 100){
		grade = scan.nextInt();
		total=total+grade;
		counter++;
		average= total/counter;
	System.out.println("Average is" +average);

	}
	average= total/10;
	System.out.println("Average is" +average);

	}
}