
import java.util.*;
class Conditional{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("How are you");
		int condition = scan.nextInt();
		System.out.println(condition == 2 ? "yes you are finr": "no you are not fine");

	}
}