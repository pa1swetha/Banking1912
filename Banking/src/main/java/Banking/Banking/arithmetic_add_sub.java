package Banking.Banking;

public class arithmetic_add_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic_add_sub aas = new arithmetic_add_sub();

		 aas.sumoftwo(1,2);
		int result= aas.AdditionOftwo(100, 500);
		  if(result>=600) {
			  System.out.println("u r el offers");
		  }
		  else
		  {
			  System.out.println("u r not el offers");
		  }
		 
		// int results = aas.AdditionOftwo(40,590);

	}

	public void sumoftwo(int a, int b) {

		int c = a + b;
		System.out.println(c);

	}

	public int AdditionOftwo(int a, int b) {

		int c = a + b;
		return c;

	}

	public void sumofthree(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void suboftwo(int a, int b) {
		System.out.println(a - b);
	}

	public void mulofthree() {
		int a = 20;
		int b = 30;
		int c = 50;
		int d = a * b * c;
		System.out.println(d);

	}

	public void mulofthree(int a, int b, int c) {
		System.out.println(a * b * c);

	}

	public void divoftwo() {
		int x = 75;
		int y = 15;
		int z = x / y;
		System.out.println("div of two" + z);

	}

	public static void printmyname() {
		String name = " chandini";
		String address = "orleans";
		System.out.println("username is " + name + "address is " + address);

	}

	public void username_password(String username, String password) {
		System.out.println(username + password);
	}

}
