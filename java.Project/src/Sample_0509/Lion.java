package Sample_0509;

public class Lion extends Animal {
	private int legs=4;
	void roar(){
//		weight=80;  //�θ�Ŭ��������  private �̱� ������ �ȉ�! ���� ����ʹٸ� �θ�Ŭ�������� protected�� �ٲٸ� ��밡��
		System.out.println("roar()�� ȣ��Ǿ���");
	}
	void setPicture(String s){
		picture = s;
		System.out.println(picture);
	}

}
