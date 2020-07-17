package ex;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class myPanel extends JPanel implements MouseListener{
	int x=0, y=0;
	
	public myPanel() {
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setBounds(x, y, 100,100);
		setBackground(Color.YELLOW);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		setLocation(x, y);
		setBackground(Color.BLUE);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class mouseListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(new myPanel());
	}
}
