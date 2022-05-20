package lectures;

public class Lecture_02 {

	public int display() {
		
		return 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num =(int)(Math.random()*20);
		System.out.println(num);
		 
		if(num > 10) 
			 System.out.println(num + " is greater than 10.");
		else if (num < 10 && num > 5)
			System.out.println(num + " between 10 and 5");
		else
			 System.out.println(num + " is less than 10");
		 
	}

}
