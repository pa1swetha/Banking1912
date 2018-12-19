package Banking.Banking;

public class ArthmaticOprations {

	public static void main(String[] args) {
		ArthmaticOprations ao = new ArthmaticOprations();
		ao.SumOfTwoValues();
       ArthmaticOprations.SumOfThree();
	}
	
	public void SumOfTwoValues() {
		int a = 50;
		int b = 50;
		int c = a+b;
		System.out.println("Sum of two values: "+c);
	}

	public  static void SumOfThree() {
		int x = 10;
		int y = 20;
		int z = 30;
		int m = x+y+z;
		System.out.println(m);
	}
}
