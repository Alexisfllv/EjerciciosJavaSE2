import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Clave  extends JFrame implements ActionListener{

	
	private JTextField txt1,txt2,txt3;
	private JButton btn1;
	
	//
	public Clave() {
		setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 10, 100, 40);
		add(txt1);
		txt2 = new JTextField();
		txt2.setBounds(10, 50, 100, 40);
		add(txt2);
		
		btn1 = new JButton("PROBAR");
		btn1.setBounds(10, 150, 100, 40);
		add(btn1);
		btn1.addActionListener(this);
		
		txt3 = new JTextField();
		txt3.setBounds(10, 100, 100, 40);
		add(txt3);
	}
	
	public static void main(String[] args) {
		Clave cl = new Clave();
		cl.setBounds(0, 0, 600, 400);
		cl.setResizable(false);
		cl.setVisible(true);
		cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//
		String nom = txt1.getText();
		String clv = txt2.getText();
		
		if (nom.equals("juan") && clv.equals("123")) {
			setTitle("Correcto");
			txt3.setText("Correcto");
		}else {
			setTitle("Incorrecto");
			txt3.setText("Incorrecto");
		}
	}

	
	
}
