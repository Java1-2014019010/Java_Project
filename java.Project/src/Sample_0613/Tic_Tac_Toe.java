package Sample_0613;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Tic_Tac_Toe extends JFrame implements ActionListener {
	JButton[][] b;
	int[][] num;
	JPanel p;
	JLabel l;
	int turn;

	public Tic_Tac_Toe() {
		setTitle("tic tac toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		turn = 1;

		p = new JPanel();

		b = new JButton[3][];
		num = new int[3][];

		for (int i = 0; i < 3; i++) {
			b[i] = new JButton[3];
			num[i] = new int[3];
			for (int j = 0; j < 3; j++) {
				b[i][j] = new JButton("");
				p.add(b[i][j]);
				b[i][j].addActionListener(this);
			}
		}
		p.setLayout(new GridLayout(0, 3, 2, 2));

		l = new JLabel("tic tac toe 게임입니다.");
		l.setFont(new Font("San Serif", Font.BOLD, 25));

		setLayout(new BorderLayout());
		add(p, BorderLayout.CENTER);
		add(l, BorderLayout.PAGE_END);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (e.getSource() == b[i][j]) {
					if (turn % 2 == 1) {
						b[i][j].setText("O");
						b[i][j].setEnabled(false);
						num[i][j] = 1;
					} else {
						b[i][j].setText("X");
						b[i][j].setEnabled(false);
						num[i][j] = 2;
					}
					turn++;
				}
			}
		}

//		for (int i = 0; i < 3; i++) {
//			if (num[i][0] == 1 && num[i][1] == 1 && num[i][2] == 1)
//				System.out.println("'O'플레이어 승");
//			if (num[i][0] == 2 && num[i][1] == 2 && num[i][2] == 2)
//				System.out.println("'X'플레이어 승");
//			if (num[0][i] == 1 && num[1][i] == 1 && num[2][i] == 1)
//				System.out.println("'O'플레이어 승");
//			if (num[0][i] == 2 && num[1][i] == 2 && num[2][i] == 2)
//				System.out.println("'X'플레이어 승");
//		}
//
//		if (num[0][0] == 1 && num[1][1] == 1 && num[2][2] == 1)
//			System.out.println("'O'플레이어 승");
//		if (num[0][0] == 2 && num[1][1] == 2 && num[2][2] == 2)
//			System.out.println("'X'플레이어 승");
//		if (num[0][2] == 1 && num[1][1] == 1 && num[2][0] == 1)
//			System.out.println("'O'플레이어 승");
//		if (num[0][2] == 2 && num[1][1] == 2 && num[2][0] == 2)
//			System.out.println("'X'플레이어 승");
	}

	public static void main(String[] args) {
		new Tic_Tac_Toe();
	}
}
