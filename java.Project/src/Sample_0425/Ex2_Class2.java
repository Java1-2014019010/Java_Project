package Sample_0425;

import java.util.Scanner;

public class Ex2_Class2 {

	public static void main(String[] args) {

		int menu = 0;
		Ex2_Class1 cc = new Ex2_Class1();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1. I. S. ");
			System.out.println("2. I. A. ");
			System.out.println("3. Quit. ");
			System.out.println("Input menu number : ");
			menu = input.nextInt();

			if (menu == 1)
				cc.ft1();
			else if (menu == 2)
				cc.ft2();
			else if (menu == 3)
				System.out.println("You missed");
			else
				System.out.println("Re-input menu number");

		} while (menu != 3);
	}

}
