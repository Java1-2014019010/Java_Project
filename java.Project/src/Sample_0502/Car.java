package Sample_0502;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	//자동차의 시리얼번호
	private int id;
	static int numbers = 0;   //생성된 Car객체의 개수를 위한 정적변수
	
	public Car(String m, String c, int s){
		super();
		this.model = m;
		this.color = c;
		this.speed = s;
		//자동차의 개수를 증가하고 id에 대입
		id = ++numbers;
	}
//	static int Car_Numbers(){ speed +=10;
//	return numbers;
	//에러

	static int Car_Numbers() {
		return numbers;
		// TODO Auto-generated method stub
		
	}
	}
	


