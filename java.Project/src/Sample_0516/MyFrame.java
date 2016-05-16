package Sample_0516;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class MyFrame extends JFrame {
  
       public MyFrame() {
    	   Toolkit kit = Toolkit.getDefaultToolkit();
    	   Dimension screenSize = kit.getScreenSize();
           setSize(300, 200);
           setLocation(screenSize.width / 2, screenSize.height / 2);  //â�� ��ġ ����
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setTitle("MyFrame");
           setVisible(true);
           setResizable(true);   //â��������������
             
           setLayout(new FlowLayout());
           JButton button1 = new JButton("button1");
           JButton button2 = new JButton("button2");
           this.add(button1);
           this.add(button2);
           setVisible(true);
       }
}