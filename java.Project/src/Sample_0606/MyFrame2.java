package Sample_0606;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;

	public MyPanel() {
		try {                                           //오류
			img = ImageIO.read(new File("car.gif"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseListener(){         //패널에 마우스 리스너를 추가한다. 무명클래스로 작성한다.
			public void mousePressed(MouseEvent e){
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}
}