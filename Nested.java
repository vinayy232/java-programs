import java.util.Scanner;
class Nested{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("put the value of a");
		a= scan.nextInt();
		if(a>50){
			System.out.println("ohh achha");
		if(a<75){
			System.out.println("budhai gye ho");
		}
		}else{
			System.out.println("dekhne de rukk");
			if(a<10){
				System.out.println("tu bachha hai be");

			}else{
				System.out.println("sab khatam hoi gya");
			}
		}

	}
}