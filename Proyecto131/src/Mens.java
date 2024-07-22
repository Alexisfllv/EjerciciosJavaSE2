import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Mens extends JFrame implements ActionListener{

	private JMenuBar bar1;
	private JMenu men1,t1,t2;
	
	private JMenuItem s1,s2,a1,a2;
	
	public Mens() {
		
		setLayout(null);
		
		bar1 = new JMenuBar();
		setJMenuBar(bar1);
		
		men1 = new JMenu("Opciones");
		bar1.add(men1);
		
		t1 = new JMenu("Tamaño de Ventana");
		men1.add(t1);
		
		t2 = new JMenu("Color de Fondo");
		men1.add(t2);
		
		a1 = new JMenuItem("640*480");
		t1.add(a1);
		a1.addActionListener(this);
		
		a2 = new JMenuItem("1024*768");
		t1.add(a2);
		a2.addActionListener(this);
		
		s1 = new JMenuItem("Rojo");
		t2.add(s1);
		s1.addActionListener(this);
		
		s2 = new JMenuItem("Verde");
		t2.add(s2);
		s2.addActionListener(this);
		
		
		
	}
	
	
	public static void main(String [] args) {
		
		
		
		//
		Mens men = new Mens();
		men.setBounds(10, 20, 300, 200);
		men.setVisible(true);
		men.setResizable(false);
		men.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if (e.getSource()== a1) {
			setSize(640,480);
		}
		
		if (e.getSource()==a2) {
			setSize(1024,768);
		}
		
		
		Container c = getContentPane();
		
		if (e.getSource()==s1) {
			c.setBackground(new Color(255,0,0));
		}
		if (e.getSource()==s2) {
			c.setBackground(new Color(0,255,0));
		}
	}
}
