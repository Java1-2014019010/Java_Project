package Sample_0502;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	//�ڵ����� �ø����ȣ
	private int id;
	static int numbers = 0;   //������ Car��ü�� ������ ���� ��������
	
	public Car(String m, String c, int s){
		super();
		this.model = m;
		this.color = c;
		this.speed = s;
		//�ڵ����� ������ �����ϰ� id�� ����
		id = ++numbers;
	}
//	static int Car_Numbers(){ speed +=10;
//	return numbers;
	//����

	static int Car_Numbers() {
		return numbers;
		// TODO Auto-generated method stub
		
	}
	}
	


