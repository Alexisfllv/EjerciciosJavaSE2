import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Quest extends JFrame implements ActionListener{

	private JTextField txt1;
	private JComboBox<String> cmb1;
	private JButton btn1;
	
	public Quest() {
		setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(120, 50, 100, 20);
		add(txt1);
		
		cmb1 = new JComboBox<String>();
		cmb1.setBounds(120, 100, 100, 20);
		cmb1.addItem("Peru");
		cmb1.addItem("Alemania");
		cmb1.addItem("Canada");
		cmb1.addItem("Japon");
		add(cmb1);
		
		btn1 = new JButton("Probar");
		btn1.setBounds(120, 150, 100, 20);
		add(btn1);
		
		btn1.addActionListener(this);
		
	}
	
	
	public static void main(String [] args) {
		//
		Quest qu = new Quest();
		qu.setBounds(0, 0, 400, 300);
		qu.setVisible(true);
		qu.setResizable(false);
		qu.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String nom = txt1.getText();
		String pai = cmb1.getSelectedItem().toString();
		
		if (e.getSource()==btn1) {
			setTitle("Nombre "+nom+" Pais "+pai);
		}
	}
}
