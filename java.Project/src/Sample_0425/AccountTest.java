package Sample_0425;

public class AccountTest {

	public static void main(String[] args) {

		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance() + "입니다.");

		Account ob1 = new Account(1,"1",1);
	}

}
