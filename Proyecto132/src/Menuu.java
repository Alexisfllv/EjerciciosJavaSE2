import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Menuu  extends JFrame implements ActionListener{

	private JMenuBar bar1;
	private JMenu menu1;
	private JMenuItem item1,item2;
	private JTextField txt1,txt2;
	
	
	public Menuu() {
		setLayout(null);
		
		bar1 = new JMenuBar();
		setJMenuBar(bar1);
		
		menu1 = new JMenu("Opcion");
		bar1.add(menu1);
		
		item1 = new JMenuItem("Redimencionar ventana");
		menu1.add(item1);
		item1.addActionListener(this);
		
		item2 = new JMenuItem("Salir del programa");
		menu1.add(item2);
		item2.addActionListener(this);
		
		//
		txt1 = new JTextField();
		txt1.setBounds(10, 10, 100, 30);
		add(txt1);
		
		txt2 = new JTextField();
		txt2.setBounds(10,50,100,30);
		add(txt2);
	}
	
	public static void main(String[] args) {
		Menuu men = new Menuu();
		men.setBounds(0, 0, 300, 200);
		men.setVisible(true);
		men.setResizable(false);
		men.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String a = txt1.getText();
		int x = Integer.parseInt(a);
		String b = txt2.getText();
		int y = Integer.parseInt(b);
		
		if (e.getSource()==item1) {
			setSize(x,y);
			//
			//setSize(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()));
		}
		
		if (e.getSource()==item2) {
			System.exit(0);
			
		}
	}
}
