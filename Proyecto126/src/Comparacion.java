import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Comparacion extends JFrame implements ActionListener{

	private JTextArea txt1,txt2;
	private JButton btn1;
	private JScrollPane scroll1, scroll2;
	
	public Comparacion () {
		setLayout(null);
		
		txt1 = new JTextArea();
		scroll1 = new JScrollPane(txt1);
		scroll1.setBounds(10, 10, 200, 140);
		add(scroll1);
		
		txt2 = new JTextArea();
		scroll2 = new JScrollPane(txt2);
		scroll2.setBounds(220, 10, 200, 140);
		add(scroll2);
		
		btn1 = new JButton("Verificar");
		btn1.setBounds(10, 170, 150, 30);
		add(btn1);
		//funcion
		btn1.addActionListener(this);
		
	}
	
	
	public static void main(String [] ars) {
		Comparacion com = new Comparacion();
		com.setBounds(EXIT_ON_CLOSE, ABORT, 500, 350);
		com.setVisible(true);
		com.setResizable(false);
		com.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String tx1 = txt1.getText();
		String tx2 = txt2.getText();
		
		if (e.getSource()== btn1) {
			if (tx1.equals(tx2)) {
				setTitle("Son textos iguales");
			}else {
				setTitle("Son textos diferentes");
			}
		}
	}
	
}
