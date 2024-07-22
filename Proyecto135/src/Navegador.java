import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Navegador extends JFrame implements ActionListener {

	private JCheckBox ch1,ch2,ch3;
	private JButton btn1;
	
	public Navegador() {
		setLayout(null);
		
		ch1 =new JCheckBox("Google");
		ch1.setBounds(10, 10, 150, 30);
		add(ch1);
	
		
		ch2 =new JCheckBox("Edge");
		ch2.setBounds(10, 50, 150, 30);
		add(ch2);
		
		
		ch3 =new JCheckBox("Mozilla");
		ch3.setBounds(10, 90, 150, 30);
		add(ch3);
		
		
		btn1 = new JButton("Probar");
		btn1.setBounds(10, 140, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		Navegador nav = new Navegador();
		nav.setBounds(0, 0, 300, 200);
		nav.setVisible(true);
		nav.setResizable(false);
		nav.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}



	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String y ="";
		if (e.getSource()==btn1) {
			if (ch1.isSelected()) {
				//setTitle(y+= "Google");
				setTitle(y+= ch1.getText());
			}
			if (ch2.isSelected()) {
				setTitle(y+=ch2.getText());
			}
			if (ch3.isSelected()) {
				setTitle(y+= ch3.getText());
			}
		}
		
	}
}
