package Banking.Banking;

public class Sample {

	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.test1();
		s.test2();
		s.test3();
		
	}
	
	public void test1() {
		System.out.println("test1 public ");
	}
	
	public void test2() {
		System.out.println("test2 public ");
	}
	
	private void test3() {
		System.out.println("test3 private");
	}
	
	public static void test4Static() {
		System.out.println("test4 ");
	}
	
	
}
