class SetGet{
	public static void main(String[] args){
	Vinay obj = new Vinay(02,06,01);
	System.out.println(obj.toMilitary());	
	}
}
class vinay{
	int hour,minute,second;
	public Vinay(int h,int m,int s){
		setTime(h,m,s);
	}
	public void setTime(int h,int m,int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h){
		hour = ((h>=0 && h<24)? h:0);
	}
	public void setMinute(int m){
		minute = ((m>=0 && m<60)? m:0);
	}

	public void setSecond(int s){
		second = ((s>=0 && s<60)? s:0);
	}
	public void getHour(int h){
		return hour;
	}
	public void getSecond(int s){
		return second;
	}
	public void getMinute(int m){
		return second;
	}
	public String toMilatry(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
}
