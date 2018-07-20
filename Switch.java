import java.util.Scanner;
class Switch{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
		
		int a,b,method,answer,remainder;
		System.out.println("add=1,sub=2,mul=3,div=4");
		System.out.println("enter the type of method");
		method = scan.nextInt();
		System.out.println("enter the value of a");
		a = scan.nextInt();
		System.out.println("enter the value of b");
		b = scan.nextInt();
		switch(method){
			case 1:
			answer = a+b;
			System.out.println("answer is:"+answer);
			break;
			case 2:
			answer = a-b;
			System.out.println("answer is:"+answer);
			break;
			case 3:
			answer = a*b;
			System.out.println("answer is:"+answer);
			break;
			case 4:
			answer = a/b;
			remainder = a%b;
			System.out.println("answer is:"+answer);
			System.out.println("raemainder is:"+remainder);
			break;
			default:
			System.out.println("  I don't get the type of method ");
			return;
		}
	}
}