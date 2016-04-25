package Sample_0425;

import java.util.Scanner;

public class Ex2_Class1 {
	
	Scanner input = new Scanner(System.in);
	
	void ft1(){
		String str1, str2;
		System.out.println("Input String1 : ");
		str1 = input.next();
		System.out.println("Input String2 : ");
		str2 = input.next();
		ft3(str1,str2);
	}
	void ft2(){
		int x, y, result;
		String op;
		System.out.println("Input number1 : ");
		x = input.nextInt();
		System.out.println("Input number2 : ");
		y = input.nextInt();
		System.out.println("Input Operator : ");
		op = input.next();
		if(op.equals("+")) 
			result = x+y;
		else if(op.equals("-")) 
			result = x-y;
		else if(op.equals("*")) 
			result = x*y;
		else if(op.equals("/")) 
			result = x/y;
		else if(op.equals("%")) 
			result = x%y;
		else 
			return;
		ft3(x, y, result, op);
	}
	void ft3(String str_a, String str_b){
		String temp;
		temp = str_a.concat(str_b);
		System.out.println(temp);
		//System.out.println(str_a.concat(str_b);
		//System.out.println(str_a+str_b);
	}
	void ft3(int x, int y, int result, String op) {
		System.out.println(x+op+y+"+"+result);
	}

}
