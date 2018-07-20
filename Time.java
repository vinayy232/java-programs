class Time{
	public static void main(String[] args){
		Vinay obj= new Vinay(0,0,0);
		System.out.println(obj.toMilitary());
		Vinay obj1= new Vinay(12,07,06);
		System.out.println(obj1.toMilitary());
		System.out.println(obj1.toRegular());
	}
}
class Vinay{
	int hour,minute,second;
	public Vinay(int hour,int minute,int second){
		this.hour=((hour>=0 && hour<24)? hour:0);
		this.minute=((minute>=0 && minute<60)? minute:0);
		this.second=((second>=0 && second<60)? second:0);
	}
	public String toMilitary(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public String toRegular(){
		return String.format("%d:%02d:%02d %s",((hour == 0 || hour ==12)?12:hour%12),minute,second,(hour>12 ? "AM":"PM"));
	}
}