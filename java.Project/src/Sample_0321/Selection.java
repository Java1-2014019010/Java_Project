package Sample_0321;

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int in;
		in = input.nextInt();

		if (in == 0) { // if(���ǽ�)
			System.out.println("in is 0");
		} else if ((in % 2) == 0) {
			System.out.println("in is even");
		} else { // case�� ��ⷯ2�� 0�ƴ� 1�ۿ����⶧���� else�� �ᵵ��!!
			System.out.println("in is odd");
		}

		switch (in % 2) {
		case 0:
			System.out.println("in is even");
			break; // �ؿ� ����ġ�� �������� �����°� ����
		case 1:
			System.out.println("in is odd");
			break; // �Ƚᵵ ��!! ��ġ�� �����ٶ����� �����ֱ����� �׳� ���� ����
		}
		input.close(); 
	}

}
