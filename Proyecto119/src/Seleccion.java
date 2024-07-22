import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Seleccion extends JFrame implements ActionListener{

	
	private JButton btn1,btn2,btn3;
	
	//
	public Seleccion() {
		setLayout(null);
		
		//
		btn1 = new JButton("ONE");
		btn1.setBounds(10,20, 100, 40);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("TWO");
		btn2.setBounds(10,80, 100, 40);
		add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("TRHEE");
		btn3.setBounds(10,160, 100, 40);
		add(btn3);
		btn3.addActionListener(this);
		
	}
	
	public static void main(String [] args) {
		Seleccion sel = new Seleccion();
		sel.setBounds(0, 0, 300, 500);
		sel.setVisible(true);
		sel.setResizable(false);
		sel.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//btn1;
		if (e.getSource()==btn1) {
			//text
			setTitle("Boton 1");
		}
		if (e.getSource()==btn2) {
			//text
			setTitle("Boton 2");
		}
		if (e.getSource()==btn3) {
			//text
			setTitle("Boton 3");
		}
	}
	
}
