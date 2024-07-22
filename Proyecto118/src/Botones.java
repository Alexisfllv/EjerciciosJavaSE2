import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botones extends JFrame implements ActionListener{

	//
	
	private JButton btn1;
	
	public Botones() {
		
		setLayout(null);
		//
		
		btn1 = new JButton("Lowe");
		btn1.setBounds(10, 40, 80, 40);
		add(btn1);
		btn1.addActionListener(this);
		
	}
	
	public static void main(String [] args) {
		
		Botones bot = new Botones();
		bot.setBounds(0, 0, 300, 500);
		bot.setResizable(false);
		bot.setVisible(true);
		bot.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//btn1
		
		if (e.getSource()==btn1) {
			System.exit(0);
		}
		
	}
	
	
}
