package Sample_0411;

public class TelevsionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television myTv = new Television(); //television�� ó���� ���� ������ �ʱ� ������ ��ȣ�� �Ѵ�!!�Լ����� �����̶� ��ȣ�� �ٴ´�(�Լ��� �ҷ����� ���ؼ�)
		Television yourTv = new Television();
		Television testTv = myTv; //�Ȱ��� ��ü�� �����ϴ°͹ۿ� �ȵȴ�.��������. ��������
		
		myTv.channel = 18;
		myTv.volume = 20;
		myTv.onOff = true;
//		myTv.onOff = false;
		
//		myTv.volume = myTv.volumeUP(30); //return
		myTv.volumeUP(30);  //(����:int data) �Լ��ȿ� �Ű������� �ٸ��� �� �Լ� ��� ���� �Ѵ� ���ÿ� �ε��ȴ�
		myTv.volumeUP();    //(����:_)
		
		myTv.pr();
		
		//System.out.println("myTv"+" "+myTv.channel + " " + myTv.volume + " " + myTv.onOff);

		yourTv.channel = 18;
		yourTv.volume = 20;
        yourTv.onOff = true;
        
        System.out.println("yourTv"+" "+yourTv.channel + " " + yourTv.volume + " " + yourTv.onOff);

        myTv.channel = 231;
        
        //testTv = null;    testTv ����� �ȵȴ�
		System.out.println("testTv"+" "+testTv.channel + " " + testTv.volume + " " + testTv.onOff);
		testTv = null;    //������ ��ü ���ֱ�
		
		//myTv�� yourTv�� ũ��� ����!!�׷��ϱ� �迭�� ������ִ�
		
		
	}

}
