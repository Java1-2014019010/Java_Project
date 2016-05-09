package Sample_0509;

abstract class Animal2{
	abstract void sound(){
//		System.out.println("Animal 努贰胶狼  sound()");
	}
}

class Dog extends Animal2{
	private int d=11;
	void sound(){
		System.out.println("港港"+d);
	}
}

class Cat extends Animal2{
	private int c=99;
	void sound(){
		System.out.println("具克"+c);
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		
//		Animal2 animal = new Animal2();
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		
//		Animal2 obj;
//		
//		obj = animal;
//		obj.sound();
//		
//		obj = dog;
//		obj.sound();
//		
//		obj = cat;
//		obj.sound();
		
		//Animal2 a = new Animal2();
		Animal2 b = new Dog();		
		Animal2 c = new Cat();
		//a.sound();
		b.sound();
		c.sound();
		//test(a);
		test(b);
		test(c);
	}

	static void test(Animal2 temp) {
		temp.sound();
	}

}
