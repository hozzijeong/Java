package ex03;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener{
	JButton btn; // 버튼을 밭는 변수 btn선언
	
	public MyPanel(){
		setLayout(null);
		setBackground(Color.YELLOW);
		
		btn = new JButton();
		btn.setSize(100,100);
		btn.setLocation(150,300);
		btn.setText("클릭");
		btn.addActionListener(this); // 버튼 자기 자신을 눌렀을때 일어나는 사건...?
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
		JFrame jFrame = new JFrame();
		MyPanel mp = new MyPanel();
		
		jFrame.setTitle("뭐지");
		jFrame.setSize(500,500); // 프레임의 사이즈 설정
		jFrame.setLocation(10,10); // 프레임의 위치 설정
		jFrame.add(mp);
		jFrame.setVisible(true); // 프레임의 시각화
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // 프레임 종료시 콘솔창도 같이 종료 설정
		jFrame.revalidate();
	}
}
