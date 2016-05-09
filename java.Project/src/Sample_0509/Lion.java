package Sample_0509;

public class Lion extends Animal {
	private int legs=4;
	void roar(){
//		weight=80;  //부모클래스에서  private 이기 떄문에 안됌! 만약 쓰고싶다면 부모클래스에서 protected로 바꾸면 사용가능
		System.out.println("roar()가 호출되었음");
	}
	void setPicture(String s){
		picture = s;
		System.out.println(picture);
	}

}
