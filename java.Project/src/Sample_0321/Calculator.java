package Sample_0321;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20, result;
		result = x + y;
		System.out.println(result);
		
		Scanner input = new Scanner(System.in); //¹®(±Í)À» ¿­·¶¾î!!
		
		int a, b, c;
		a = input.nextInt(); 
		b = input.nextInt();
		
		c = a * b;
		
		System.out.println("multi : "+ c);
		
		input.close();  //¹®(±Í)À» ´Ý¾Æ¾ßÇØ!! (ÇÊ¼ö´Â ¾Æ´Ï¾ß)
	}

}
