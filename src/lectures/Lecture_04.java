package lectures;

public class Lecture_04 {
	
	// loops are not statements --> they are not terminated but exit
	// entry criteria --> loop condition must be true
	// exit criteria --> loop condition is false

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i <= 10) {
			System.out.print(i);
			i++;
		}
		
		int j = 12;
		do {
			System.out.println(j);
			j++;
		}
		while(j<=10);
		System.out.println("After Loop");
	}

}
