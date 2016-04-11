package Sample_0411;

public class Television {
	
	int channel;      // 채널 번호
	int volume;       // 볼륨
	boolean onOff;    // 전원 상태

	void pr(){ //void:output이 없을떄!!(원래는 입력값이없을떄!)
		System.out.println(channel+" "+volume+" "+onOff);
}
//	int volumeUP(int up_data){  //이땐 return 사용이 별로지만 한번 써보자! 밑에것이 더 좋은 소스
//	    int vol = volume;
//	    vol+=up_data; 
//	    return vol;
	    
	void volumeUP(int data){
	    if(onOff == false){
	    	System.out.println("TV Die");
	    	return;  // 단순 메서드 종료의 목적
	   	}
	    volume+=data; 
	}
	
	void volumeUP(){
	    if(onOff == false){
	    	System.out.println("TV Die");
	    	return;  // 단순 메서드 종료의 목적
	   	}
	    volume+=1; 
	}
}
