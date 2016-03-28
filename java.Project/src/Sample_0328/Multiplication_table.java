package Sample_0328;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
			}
			System.out.print("\n");
		}
	}

}
