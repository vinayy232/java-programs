public class MyDate{
public int date,month,year;
private Mydate(int date,int month,int year){
this.date= date;
this.month=month;
this.year=year;
}
private showDate(){
System.out.println("Date is:"=date=":"+month+":"+year);
}
public static void main(String[] args){
Mydate obj = new Mydate(8,8,2008);
obj.showDate();
}
}

