package ex02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 1. ������ : java.awt
 * 2. �Ź��� : javax.swing
 * 	       : Ŭ������ �տ� J�� ����
 */

class MyPanel extends JPanel implements ActionListener{
	
	JButton btn;
	
	public MyPanel() {
		// JPanel�� �̹� ������ ���̾ƿ��� ��ȿȭ
		setLayout(null);
		
		setBackground(Color.RED);
		
		btn = new JButton();
		btn.setSize(100, 100);
		btn.setLocation(10, 10);
		btn.setText("Ȯ��");
		
		btn.addActionListener(this);
		add(btn);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			btn.setText("���");
		}
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		// �ֻ��� �����̳�
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setLocation(50, 50);
		
		// MyPanel mp = new MyPanel();
		frame.add(new MyPanel());
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}







