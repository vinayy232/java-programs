import java.util.*;
public class Calculator{
static	int a,b,answer,remainder;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for a");
		a = scan.nextInt();
		System.out.println("Enter the value for b");
		b = scan.nextInt();
		answer= a/b;
		remainder= a%b;
		/*answer= a-b;
		answer= a/b;
		answer= a*b;*/
		System.out.print("the answer is :"+answer);
		System.out.print("  Remainder is:"+remainder);
	}




}