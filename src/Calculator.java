
public class Calculator {

//	CTRL + Shift + F - alignment

	public Calculator() {
		System.out.println("Calling the constructor. ");
	}

	public void add() {
//		ClassName - TheDarkKnight
//		methodName - theDarkKnight
		System.out.println("Adding some numbers.");
	}

	public void sub() {
		System.out.println("Subtracting numbers.");
	}

	public void mult() {
		System.out.println("Multiplying numbers");
	}

	public void dividing() {
		System.out.println("Dividing numbers");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		calc.add();
		calc.mult();
		calc.dividing();
		calc.sub();
		new Calculator().notify();
		System.out.println("Hello, World!");
	}

}
