public class MyDate{
 int date,month,year;
private MyDate(int date,int month,int year){
this.date= date;
this.month=month;
this.year=year;
}
public void showDate(){
System.out.println("Date is:"+date+":"+month+":"+year);
}
public static void main(String[] args){
MyDate obj = new MyDate(8,8,2008);
MyDate vivo = new MyDate(9,9,2009);
obj.showDate();
vivo.showDate();

}
}

