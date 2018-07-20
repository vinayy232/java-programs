class PatternOne{
	public static void main(String[] args){
	/*	for(int x=0;x<3;x++){
			//for(int y=4;y>3-x;y--){
				System.out.print("A");
			//}
			System.out.println();						ascending
		}

	}*/
/*for(int x=0;x<3;x++){
	for(int y=0;y<3-x;y++){
	System.out.print("A");								descending
	}
	System.out.println();
}*/
for(int x=0;x<3;x++){
	for(int y=0;y<2-x;y++){
		System.out.print(" ");
	}
	for(int z=3;z>2-x;z--){
		System.out.print("A");
	}
	System.out.println();
}
}
}