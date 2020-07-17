package ex04;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener{
	JButton btn_arr[];
	
	public MyPanel() {
		setLayout(null);
		setBackground(Color.BLACK);
		btn_arr = new JButton[5];
		
		for(int i=0; i<btn_arr.length;i++) {
			btn_arr[i] = new JButton();
			btn_arr[i].setText((i+1)+"번 버튼");
			btn_arr[i].setSize(100, 100);
			btn_arr[i].setLocation(100+(i+1)*100, 300);
			btn_arr[i].addActionListener(this);
			add(btn_arr[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<btn_arr.length; i++) {
			if(e.getSource() == btn_arr[i]) {
				btn_arr[i].setText((i+6)+"번 버튼");
			}
		}
	}
}



public class Button_Array {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		MyPanel mp = new MyPanel();
		
		jFrame.setSize(1000,1000);
		jFrame.setLocation(100,100);
		jFrame.setTitle("버튼 배열");
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.add(mp);
	}
}
