package Sample_0411;

public class Television {
	
	int channel;      // ä�� ��ȣ
	int volume;       // ����
	boolean onOff;    // ���� ����

	void pr(){ //void:output�� ������!!(������ �Է°��̾�����!)
		System.out.println(channel+" "+volume+" "+onOff);
}
//	int volumeUP(int up_data){  //�̶� return ����� �������� �ѹ� �Ẹ��! �ؿ����� �� ���� �ҽ�
//	    int vol = volume;
//	    vol+=up_data; 
//	    return vol;
	    
	void volumeUP(int data){
	    if(onOff == false){
	    	System.out.println("TV Die");
	    	return;  // �ܼ� �޼��� ������ ����
	   	}
	    volume+=data; 
	}
	
	void volumeUP(){
	    if(onOff == false){
	    	System.out.println("TV Die");
	    	return;  // �ܼ� �޼��� ������ ����
	   	}
	    volume+=1; 
	}
}
