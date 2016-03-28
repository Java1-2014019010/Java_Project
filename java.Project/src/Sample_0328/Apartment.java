package Sample_0328;

public class Apartment {

	public static void main(String[] args) {

		for (int i = 9; i > 0; i--) {
			if (i == 4)
				continue;                  // 4Ãþ¸¸ ¾ø¾Ö±â!!
			for (int j = 1; j < 9; j++) {
				if (i > 5) {
					if (j > 5)
						break;
				}
				System.out.print(i * 100 + j + "\t");
			}
			System.out.println();
		}

		// ±³¼ö´Ô²¾¼­ ÇØÁÖ½Å °Í
		// for(int i=9;i>=1;i--){
		// for(int j=1;j<=8;j++){
		// if(j==6 && i>=6) break;
		// System.out.print(i*100+j+"\t");
		// }System.out.println();
		// }

	}

}
