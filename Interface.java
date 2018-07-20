public class Interface{
	public static void main(String[] args){
		
FourWheeler obj = new FourWheeler();
obj.print();
obj.display();
	}

}
 interface Printable{
	int a =10;		// all variables are bydefault public static and final
	void print();

}
 class FourWheeler implements Printable,Vinay{
	public void print(){
		System.out.println("Print for four wheeler");

	}
	public void display(){
	System.out.println("Print from display");	

	}
	}
   interface Vinay{
	void display();


}