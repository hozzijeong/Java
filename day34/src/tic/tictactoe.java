package tic;
/*
 * 실행할때마다 new 가 새롭게 되기 때문! 생성자로 옮겨보자
 */
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Mypanel extends JPanel implements ActionListener{
	JButton btn_arr[][];
	JButton reStart;
	JButton win;
	JButton result;
	int arr[][];
	int turn =0;
	int check = 0;
	
	
	public Mypanel() {
		setLayout(null);
		setBackground(Color.GRAY);
		set();
		
	}
	
	public void set() {
		btn_arr = new JButton[3][3];
		for(int i=0; i<btn_arr.length;i++) {
			for(int j=0; j<btn_arr[i].length; j++) {
				btn_arr[i][j] = new JButton();
				btn_arr[i][j].setText(" ");
				btn_arr[i][j].setSize(100,100);
				btn_arr[i][j].setLocation(100*(i+1), 100*(j+1));
				btn_arr[i][j].addActionListener(this);
				add(btn_arr[i][j]);
			}
		}
		
		reStart = new JButton();
		reStart.setSize(100, 50);
		reStart.setLocation(300, 450);
		reStart.addActionListener(this);
		reStart.setText("다시 시작");
		add(reStart);
		
		win = new JButton();
		win.setSize(150,50);
		win.setLocation(100, 450);
		win.addActionListener(this);
		win.setText("누가 승자?");
		add(win);
		
		result = new JButton();
		result.setSize(100,50);
		result.setLocation(200, 250);
		
	}
	
	public void Win() {
		arr = new int[3][3];
		int win = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 0;
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
			if(arr[i][0] == 1 && arr[i][1] ==1 && arr[i][2] ==1	) {
				win =1;
			}else if(arr[i][0]==2 && arr[i][1] ==2 && arr[i][2] ==2 ) {
				win =2;
			}
		}
		for(int i=0; i<3; i++) {
			if(arr[0][i] == 1 && arr[1][i] ==1 && arr[2][i] ==1	) {
				win =1;
			}else if(arr[0][i] == 2 && arr[1][i] ==2 && arr[2][i] ==2) {
				win =2;
			}
		}
		if(win ==1) {
			check = 1;
		}else if(win ==2) {
			check =2;
		}else {
			check = -1;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Win();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(turn %2 ==0) {
					if(arr[i][j] ==0) {
						if(e.getSource() == btn_arr[i][j]) {
							btn_arr[i][j].setText("O");
							arr[i][j] = 1;
							turn +=1;
						}
					}else {
						continue;
					}
				}else if(turn %2 ==1) {
					if(arr[i][j] == 0) {
						if(e.getSource() == btn_arr[i][j]) {
							btn_arr[i][j].setText("X");
							arr[i][j] = 2;
							turn +=1;
						}
					}else {
						continue;
					}
				}
			}
		}
		System.out.println(check+","+turn);
		
		if(check == -1 && turn ==9) {
			add(result);
			result.setText("비김.");
		}
		
		if(check == 1) {
			add(result);
			result.setText("P1 승리!");
		}else if(check == 2) {
			add(result);
			result.setText("P2 승리!");
		}
		
		if(e.getSource() == reStart) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					btn_arr[i][j].setText(" ");
				}
			}
			win.setText("누가 승자?");
			turn = 0;
			check = -1;
		}
		
		if(e.getSource() == win	) {
			if(check == -1) {
				win.setText("아직 게임중...");
			}else if(check ==1) {
				add(result);
				result.setText("P1승리!");
				win.setText("P1승리!");
			}else if(check ==2) {
				add(result);
				result.setText("P2승리!");
				win.setText("P2 승리!");
			}
		}
	}
}
public class tictactoe {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		Mypanel mp = new Mypanel();
		jFrame.setTitle("Tic Tac Toe");
		jFrame.setSize(600, 600);
		jFrame.setLocation(50, 50);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.add(mp);
	}
}
