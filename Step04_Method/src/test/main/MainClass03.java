package test.main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass03 {
	public static void main(String[] args) {

		JFrame f=new JFrame();
		f.setSize(300, 400);
		f.setTitle("����");
		f.setLayout(new BorderLayout());
		JButton btn=new JButton();
		btn.setText("button");
		
		f.add(btn, BorderLayout.NORTH);
		
		f.setVisible(true);
	}
}
