package ex;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class myPanel extends JPanel implements ActionListener{
	Random ran = new Random();
	JButton btn_arr[][];
	int front[][];
	int back[][];
	final int SIZE = 5;
	int cnt = 1;
	
	public myPanel() {
		setLayout(null);
		setBackground(Color.GRAY);
		set();
	}
	
	public void set() {
		shuffle();
		btn_arr = new JButton[SIZE][SIZE];
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				btn_arr[i][j] = new JButton();
				btn_arr[i][j].setSize(100, 100);
				btn_arr[i][j].setLocation(100*(i+1), 100*(j+1));
				btn_arr[i][j].addActionListener(this);
				btn_arr[i][j].setText(front[i][j]+"");
				add(btn_arr[i][j]);
			}
		}
	}
	
	public void int_set() {
		front = new int[SIZE][SIZE];
		back = new int[SIZE][SIZE];
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				front[i][j] = i*5 + (j+1);
				back[i][j] = 25+(i*5) + (j+1);
			}
		}
	}
	
	public void shuffle() {
		int_set();
		for(int i=0; i<1000; i++) {
			int r1 = ran.nextInt(5);
			int r2 = ran.nextInt(5);
			
			int temp = front[0][0];
			front[0][0] = front[r1][r2];
			front[r1][r2] = temp;
			
			temp = back[0][0];
			back[0][0] = back[r1][r2];
			back[r1][r2] = temp;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(cnt <26) {
						if(e.getSource() == btn_arr[i][j]) {
							btn_arr[i][j].setText(back[i][j]+"");
							cnt+=1;
						}
				}else if(cnt>25) {
					if(e.getSource() == btn_arr[i][j]) {
						btn_arr[i][j].setText(" ");
						cnt+=1;
					}
				}
			}
		}
	}
	
}

public class ex_1to50 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		myPanel mp = new myPanel();
		
		frame.setSize(1000,1000);
		frame.setLocation(100, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(mp);
		
		
		
		
	}
}
