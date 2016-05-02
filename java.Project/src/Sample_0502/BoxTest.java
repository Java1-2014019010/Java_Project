package Sample_0502;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box obj1 = new Box(10,20,50);
//		Box obj2 = new Box(10,30,30);
//		
//		Box largest = obj1.whosLargest(obj1,obj2);
//		System.out.println("("+largest.w+", "+largest.l+", "+largest.l+", "+largest.h+")");
		
		int x = 10;
		Box obj1 = new Box(1,2,3);
		Box obj2 = new Box(4,5,6);
		
		System.out.println(obj1.getH()+" "+obj2.getH()+" "+x);
		
		Box obj3 = obj1.method1(obj1, obj2,x);
		
		System.out.println("after "+obj1.getH()+" "+obj2.getH()+" "+x);
	
	
	}

}
