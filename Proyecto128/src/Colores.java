import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Colores extends JFrame implements ActionListener{

	private JLabel lbl1,lbl2,lbl3;
	private JComboBox<String> cmb1,cmb2,cmb3;
	private JButton btn1;
	
	public Colores() {
		setLayout(null);
		
		lbl1 = new JLabel("Rojo");
		lbl1.setBounds(10, 10, 100, 30);
		add(lbl1);
		lbl2 = new JLabel("Verde");
		lbl2.setBounds(10, 50, 100, 30);
		add(lbl2);
		lbl3 = new JLabel("Azul");
		lbl3.setBounds(10, 90, 100, 30);
		add(lbl3);
		
		cmb1 = new JComboBox<String>();
		cmb1.setBounds(120, 10, 50, 20);
		add(cmb1);

		cmb2 = new JComboBox<String>();
		cmb2.setBounds(120, 50, 50, 20);
		add(cmb2);
		
		cmb3 = new JComboBox<String>();
		cmb3.setBounds(120, 90, 50, 20);
		add(cmb3);
		
		//
		for (int i = 0; i <= 255; i++) {
			cmb1.addItem(String.valueOf(i));
			cmb2.addItem(String.valueOf(i));
			cmb3.addItem(String.valueOf(i));
			
		}
		
		btn1 = new JButton("Probar");
		btn1.setBounds(10, 130, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	
	public static void main(String [] args) {
		Colores col = new Colores();
		col.setBounds(0, 0, 400, 300);
		col.setResizable(false);
		col.setVisible(true);
		col.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String a = cmb1.getSelectedItem().toString();
		String b = cmb2.getSelectedItem().toString();
		String c = cmb3.getSelectedItem().toString();
		
		int rojo = Integer.parseInt(a);
		int verde = Integer.parseInt(b);
		int azul = Integer.parseInt(c);
		
		if (e.getSource()==btn1) {
			//
			Color col = new Color(rojo,verde,azul);
			btn1.setBackground(col);
		}
	}
}
