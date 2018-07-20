import java.util.Scanner;
class Ifelse{

	public static void main(String[] args){
		int a, b,  answer;
		int method;
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("add=1,sub=2,multiply=3,division=4");
		System.out.println("enter the type of method");
		method = scan.nextInt();
		System.out.println("enter any value of a");
		a = scan.nextInt();
		System.out.println("enter any value of b");
		b = scan.nextInt();
		if(method == 1){
			answer = a+b;
			System.out.println(answer);
		}
		if(method == 2){
			answer = a-b;
			System.out.println(answer);
		}
		if(method == 3){
			answer = a*b;
			System.out.println(answer);
		}
		if(method == 4){
			answer = a/b;
			System.out.println(answer);
			System.out.println("Thank you for using me.");
		}
	}
}