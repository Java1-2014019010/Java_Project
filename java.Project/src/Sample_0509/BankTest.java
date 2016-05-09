package Sample_0509;

class Bank {
	double getInterRate(){
		return 0.0;
	}
}

class BadBank extends Bank {
	double getInterRate(){
		return 10.0;
	}
}

class NormalBank extends Bank {
	double getInterRate(){
		return 5.0;
	}
}

class GoodBank extends Bank {
	double getInterRate(){
		return 3.0;
	}
}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율: "+b1.getInterRate());
		System.out.println("NormalBank의 이자율: "+b2.getInterRate());
		System.out.println("GoodBank의 이자율: "+b3.getInterRate());
		
	}

}