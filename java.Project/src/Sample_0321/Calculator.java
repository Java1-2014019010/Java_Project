package Sample_0321;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20, result;
		result = x + y;
		System.out.println(result);
		
		Scanner input = new Scanner(System.in); //��(��)�� ������!!
		
		int a, b, c;
		a = input.nextInt(); 
		b = input.nextInt();
		
		c = a * b;
		
		System.out.println("multi : "+ c);
		
		input.close();  //��(��)�� �ݾƾ���!! (�ʼ��� �ƴϾ�)
		

	}

}

//		int i, j;
//		i = 1;
//		j = ++i; >> i=1+1=2 & j=2
		
//		int i, j;
//		i = 1;
//		j = i++; >> j=1 & i=1+1=2

//		x=1
//      y=++x + x++ + --x + x++ + ++x >> x=1+1-1+1=2 & y=10
		