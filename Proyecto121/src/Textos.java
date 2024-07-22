import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Textos extends JFrame implements ActionListener{
	
	//
	private JLabel lbl1;
	private JButton btn1;
	private JTextField txt1;
	
	public Textos() {
		setLayout(null);
		
		lbl1 = new JLabel("Nombre : ");
		lbl1.setBounds(10, 10, 100, 30);
		add(lbl1);
		
		txt1 = new JTextField("");
		txt1.setBounds(120, 10, 150, 20);
		add(txt1);
		
		btn1 = new JButton("Aceptar");
		btn1.setBounds(10, 80, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	
	public static void main(String [] args) {
		//
		Textos tex = new Textos();
		tex.setBounds(0, 0, 350, 170);
		tex.setResizable(false);
		tex.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tex.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String name = txt1.getText();
		
		if (e.getSource()==btn1) {
			setTitle(name);
		}
	}
}
