import java.util.Random;
public class Generator{
	public static void main(String[] args){
		Random rand = new Random();
		int number ;
		for(int i=0;i<=10;i++){
		number = 1 + rand.nextInt(100);
		System.out.println(number);
		}
	}


}