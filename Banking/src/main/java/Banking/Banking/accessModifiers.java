package Banking.Banking;

public class accessModifiers {

	public static void main(String[] args) {

    
    accessModifiers am = new accessModifiers();
    am.sumOfTwo();
	am.sum(100, 700);
    am.sum(300, 600);
    am.sum(800, 2);
    
	}
	
	
	public void sumOfTwo() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}

	public void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void SubOfTwo() {
		int x = 100;
		int y = 50;
		int z = x-y;
		System.out.println(z);
	}
	
	private void test1_private() {
		System.out.println("I am Private Test");
	}
	
	
	
	public void test2_public() {
		System.out.println("i am public Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
