import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Suma extends JFrame implements ActionListener{
	private JTextField txt1,txt2;
	private JButton btn1;
	public Suma() {
		
		setLayout(null);
		
		txt1 = new JTextField("");
		txt1.setBounds(10, 10, 100, 30);
		add(txt1);
		
		txt2 = new JTextField("");
		txt2.setBounds(10, 50, 100, 30);
		add(txt2);
		
		btn1 = new JButton("Sumar");
		btn1.setBounds(10, 90, 100, 30);
		add(btn1);
		btn1.addActionListener(this);	
	}
	public static void main(String [] args) {
		//
		Suma sum = new Suma();
		sum.setBounds(0, 0, 240, 170);
		sum.setResizable(false);
		sum.setVisible(true);
		sum.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//
		String uno = txt1.getText();
		String dos = txt2.getText();
		int a = Integer.parseInt(uno);
		int b = Integer.parseInt(dos);
		int suma = a+b;
		String resultado = String.valueOf(suma);
		if (e.getSource()==btn1) {
			setTitle(resultado);
		}
	}

}
