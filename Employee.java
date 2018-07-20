class Employee{
static int employeeId = 0;
static int employeeSalary;
static String employeeName;
public Employee(int salary,String name){
employeeId++;
employeeSalary = salary;
employeeName= name;

}
public static void displayEmployee(){
System.out.println("Employee is:"+employeeId + "  "+ employeeName + employeeSalary);

}
public static void main(String[] args){
Employee e1 = new Employee(2000,"VINAY  ");
e1.displayEmployee();
Employee e2 = new Employee(3000,"vivek  ");
e2.displayEmployee();
Employee e3 = new Employee(4000,"Monu  ");
e3.displayEmployee();
System.out.print("total employee  ");
System.out.println(Employee.employeeId);
}
}
