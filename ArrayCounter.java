import java.util.*;
class ArrayCounter{
	public static void main(String[] args){
		int freq[] = new int[7];
		Random rand = new Random();
		for(int roll=1;roll<1000;roll++){
			++freq[1+rand.nextInt(6)];

	
		}
		System.out.println("face \t frequency");
		for(int face =1;face<freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
		
		}

	}
}