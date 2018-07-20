class Client{
	
	public static void main(String[] args){
	
	Developer d = new Developer(1,"vinay",9000,1000,1000);
	d.displayEmployee();	
	//d.displayDeveloper();
	}
}

 class Employee{
	int employeeId,employeeSalary;
	String employeeName;
	public Employee(int id, String name, int salary){
		employeeId = id;
		employeeSalary= salary;
		employeeName = name;
	}
	void displayEmployee(){
System.out.println(+employeeId + employeeName + employeeSalary);

	}
}
class Developer extends Employee{
int pf, ta;
public Developer(int id,String name,int salary, int pf,int ta){
super(id,name,salary);
this.pf=pf;
this.ta=ta;
}
void displayEmployee(){
	int netSalary = employeeSalary + pf +ta;
	System.out.println("developer is:"+employeeId+employeeName+netSalary);
}
/*void displayDeveloper(){
	int netSalary = employeeSalary + pf +ta;
	System.out.println("developer is:"+employeeId+employeeName+netSalary);
}*/
}