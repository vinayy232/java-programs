import java.util.Scanner;
class While{
	public static void main(String[] args){
	Vinay obj = new Vinay();
	Scanner scan = new Scanner{System.in};
	System.out.println("Enter your name");
	String name = scan.nextLine();
	obj.displayName(name);
	obj.display();
	obj.increment();	
	}
}
class Vinay{
	void display(){
	System.out.println("another class");
}
void increment(){
	int i=0;
		while(i<10){
			System.out.println(i);
			i++;
		}
	}
	void displayName(String name){
		System.out.println("Hello"+name);
	}
}
