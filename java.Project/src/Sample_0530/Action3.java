package Sample_0530;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {

	private JButton button;
	private JLabel label;

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");

		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					label.setText("��ħ�� ��ư�� ���������ϴ�.");
				}
			}
		});
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}

}

public class Action3 {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}