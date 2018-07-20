import java.util.Scanner;
class Techgig{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int vinay = scan.nextInt();
		for(int x=0;x<vinay;x++){
			for(int y=x;y<vinay;y++){
				System.out.print(x+1);
			}
			System.out.println();
		}
	}
}