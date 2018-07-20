class Date{
public int date,month,year;

public Date(int date,int month,int year){
this.date=date;
this.month=month;
this.year=year;
}
public void showDate(){

System.out.println("date is:"+date+":"+month+":"+year);
}
public static void main(String[] args){
Date obj = new Date(9,9,2009);

obj.showDate();
}
}