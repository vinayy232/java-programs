/*import java.util.Scanner;
class ExceptionDemo{
public static void main(String[] args){
	int a,b,result= 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value for a");
	a = scan.nextInt();
	
	System.out.println("Enter the value for b");
	b = scan.nextInt();
	
	result =a/b;
	System.out.println("result is:"+result);

}
}*/
/*
import java.util.Scanner; /// multiple catches
class ExceptionDemo{
	private void display(){
		
		System.out.println("vinay");
	}
public static void main(String[] args){
	int a,b,result= 0;
	Scanner scan = new Scanner(System.in);
	ExceptionDemo oj = null;
	
	System.out.println("Enter the value for a");
	a = scan.nextInt();
	
	System.out.println("Enter the value for b");
	b = scan.nextInt();
	try{
	result =a/b;
	System.out.println("result is:"+result);
		oj.display();	}
	catch(ArithmeticException ae){
		System.out.println("hey you cannot divide any value \n try different value for b");
		System.out.println("Enter the value for b");
	b = scan.nextInt();
	result =a/b;
	System.out.println("result is:"+result);
	}catch(NullPointerException e){
	System.out.println("object is not created");
	ExceptionDemo obj = new ExceptionDemo();
	obj.display();
}
finally{
	System.out.println("All should be closed");
}
}
}*/
import java.util.Scanner; /// multiple catches with finally
class ExceptionDemo{
	private void display(){
		
		System.out.println("vinay");
	}
public static void main(String[] args){
int a,b,result= 0;
	Scanner scan = new Scanner(System.in);
	ExceptionDemo oj = null;
	
	System.out.println("Enter the value for a");
	a = scan.nextInt();
	
	System.out.println("Enter the value for b");
	b = scan.nextInt();
	try{
	result =a/b;
	System.out.println("result is:"+result);
		oj.display();	}
	catch(ArithmeticException ae){
		System.out.println("hey you cannot divide any value \n try different value for b");
		System.out.println("Enter the value for b");
	b = scan.nextInt();
	result =a/b;
	System.out.println("result is:"+result);
	}catch(NullPointerException e){
	System.out.println("object is not created");
	ExceptionDemo obj = new ExceptionDemo();
	obj.display();
}
finally{
	System.out.println("All should be closed");
}
}
}