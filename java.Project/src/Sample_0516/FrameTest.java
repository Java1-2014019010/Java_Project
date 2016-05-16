package Sample_0516;

import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {

		JFrame f = new JFrame("Frame Test");  //JFrame의 객체생성 &창의 이름!

		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}