class Vinay{
	public static void main(String[] args){
		Circle c = new Circle(5);
		c.calculateArea();
	}

}
 abstract class  Shape{
	 abstract void calculateArea();

	void display(){
		System.out.println("Display");
	}

}
 class Circle extends Shape{
int r;
public Circle(int r){
	
	this.r = r;
}

void calculateArea(){
		float area = 3.14f *r *r;
System.out.println("Area of circle is:"+area);
	}
	


}