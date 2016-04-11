package Sample_0411;

public class TelevsionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television myTv = new Television(); //television이 처음엔 값을 가지지 않기 떄문에 괄호를 한다!!함수적인 개념이라서 괄호를 붙는다(함수를 불러내기 위해서)
		Television yourTv = new Television();
		Television testTv = myTv; //똑같은 객체를 복사하는것밖에 안된다.얕은복사. 참조변수
		
		myTv.channel = 18;
		myTv.volume = 20;
		myTv.onOff = true;
		
		System.out.println(myTv.channel + " " + myTv.volume + " " + myTv.onOff);

		yourTv.channel = 18;
		yourTv.volume = 20;
        yourTv.onOff = true;
        
        System.out.println(yourTv.channel + " " + yourTv.volume + " " + yourTv.onOff);

        myTv.channel = 231;
        
        //testTv = null;    testTv 출력이 안된다
		System.out.println(testTv.channel + " " + testTv.volume + " " + testTv.onOff);
		testTv = null;    //생성된 객체 없애기
		
		//myTv와 yourTv의 크기는 같다!!그러니까 배열을 만들수있다
	}

}
