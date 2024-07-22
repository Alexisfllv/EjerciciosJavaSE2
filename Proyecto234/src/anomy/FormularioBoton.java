package anomy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioBoton extends JFrame{

	
	//
	
	private JButton btn1;
	
	public FormularioBoton() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		btn1 = new JButton("0");
		btn1.setBounds(40,20,100,50);
		add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			//@Override
			public void actionPerformed(ActionEvent e) {
				
				int valor = Integer.parseInt(btn1.getText());
				valor++;
				btn1.setText(String.valueOf(valor));
				
			}
		});
	}
	//
	public static void main (String [] arg) {
		FormularioBoton fb = new FormularioBoton();
		fb.setBounds(0,0,200,120);
		fb.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		fb.setVisible(true);
	}
}
