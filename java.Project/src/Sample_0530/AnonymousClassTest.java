package Sample_0530;

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl(){
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}			
		};
		ac.turnOn();
		ac.turnOff();
	}

}