
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Colore extends JFrame implements ActionListener{

	private JMenuBar menb1;
	private JMenu	men1;
	private JMenuItem mi1,mi2,mi3;
	
	
	public Colore () {
		setLayout(null);
		
		menb1 = new JMenuBar();
		setJMenuBar(menb1);
		
		men1 = new JMenu("Opciones");
		menb1.add(men1);
		
		mi1 = new JMenuItem("Rojo");
		men1.add(mi1);
		
		mi2 = new JMenuItem("Verde");
		men1.add(mi2);
		
		mi3 = new JMenuItem("Azul");
		men1.add(mi3);
		
		//
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
	}
	
	
	public static void main(String [] args) {
		Colore col = new Colore();
		col.setBounds(10, 20, 300, 200);
		col.setVisible(true);
		col.setResizable(false);
		col.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Container c = getContentPane();
		
		if (e.getSource() == mi1) {
			c.setBackground(new Color(255,0,0));
		}
		
		if (e.getSource() == mi2) {
			c.setBackground(new Color(0,255,0));
		}
		
		if (e.getSource() == mi3) {
			c.setBackground(new Color(0,0,255));
		}
	}
}
