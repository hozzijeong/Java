package ex02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 1. 구버전 : java.awt
 * 2. 신버전 : javax.swing
 * 	       : 클래스명 앞에 J를 부착
 */

class MyPanel extends JPanel implements ActionListener{
	
	JButton btn;
	
	public MyPanel() {
		// JPanel의 이미 설정된 레이아웃을 무효화
		setLayout(null);
		
		setBackground(Color.RED);
		
		btn = new JButton();
		btn.setSize(100, 100);
		btn.setLocation(10, 10);
		btn.setText("확인");
		
		btn.addActionListener(this);
		add(btn);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			btn.setText("취소");
		}
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		// 최상위 컨테이너
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setLocation(50, 50);
		
		// MyPanel mp = new MyPanel();
		frame.add(new MyPanel());
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}







