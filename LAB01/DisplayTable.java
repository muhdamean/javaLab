//program to display mathematical table
//U15/FNS/CSC/038
public class DisplayTable {
	public static void main(String[] args) {
		int mulOne=1,mulTwo=2,mulThree=3,mulFour=4;
		System.out.println("\t"+mulOne+"\t"+mulTwo+"\t"+mulThree+"\t"+mulFour);
		for(int i=1;i<5;i++) {			
			System.out.println(mulOne*i+"\t"+mulOne*i+"\t"+mulTwo*i+"\t"+mulThree*i+"\t"+mulFour*i);
		}
	}
}
