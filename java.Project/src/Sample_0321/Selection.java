package Sample_0321;

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int in;
		in = input.nextInt();

		if (in == 0) { // if(조건식)
			System.out.println("in is 0");
		} else if ((in % 2) == 0) {
			System.out.println("in is even");
		} else { // case가 모듈러2가 0아님 1밖에없기때문에 else만 써도됨!!
			System.out.println("in is odd");
		}

		switch (in % 2) {
		case 0:
			System.out.println("in is even");
			break; // 밑에 스위치를 연속으로 누르는것 방지
		case 1:
			System.out.println("in is odd");
			break; // 안써도 됌!! 그치만 끝났다란것을 보여주기위해 그냥 쓰자 ㅎㅎ
		}
		input.close(); 
	}

}
