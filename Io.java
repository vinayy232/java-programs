import java.util.Scanner;
public class Io {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some String : ");
		String user_input_string = scan.nextLine();
		System.out.println("Enter some Number : ");
		long user_input_Long =scan.nextLong();
		System.out.println("\nThe entered String is");
		System.out.print(user_input_string);
		System.out.println("\nThe entered Number is");
		System.out.print(user_input_Long);
	}
}