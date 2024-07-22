import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botones extends JFrame implements ActionListener {
	
	private JButton btn1,btn2;
	
	public Botones() {
		setLayout(null);
		
		btn1 = new JButton("Varon");
		btn1.setBounds(10, 50, 80, 30);
		add(btn1);
		btn1.addActionListener(this);
		
		
		btn2 = new JButton("Mujer");
		btn2.setBounds(10, 100, 80, 30);
		add(btn2);
		btn2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		//
		Botones bot = new Botones();
		bot.setBounds(0, 0, 300, 500);
		bot.setResizable(false);
		bot.setDefaultCloseOperation(EXIT_ON_CLOSE);
		bot.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn1) {
			setTitle("Varon");
		}
		if (e.getSource() == btn2) {
			setTitle("Mujer");
		}
	}

}
