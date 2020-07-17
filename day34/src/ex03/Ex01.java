package ex03;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener{
	JButton btn; // ��ư�� ��� ���� btn����
	
	public MyPanel(){
		setLayout(null);
		setBackground(Color.YELLOW);
		
		btn = new JButton();
		btn.setSize(100,100);
		btn.setLocation(150,300);
		btn.setText("Ŭ��");
		btn.addActionListener(this); // ��ư �ڱ� �ڽ��� �������� �Ͼ�� ���...?
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
		JFrame jFrame = new JFrame();
		MyPanel mp = new MyPanel();
		
		jFrame.setTitle("����");
		jFrame.setSize(500,500); // �������� ������ ����
		jFrame.setLocation(10,10); // �������� ��ġ ����
		jFrame.add(mp);
		jFrame.setVisible(true); // �������� �ð�ȭ
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // ������ ����� �ܼ�â�� ���� ���� ����
		jFrame.revalidate();
	}
}
