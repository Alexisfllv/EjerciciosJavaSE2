import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Suma extends JFrame implements ChangeListener,ActionListener {

	private JTextField txt1,txt2;
	private JRadioButton ra1,ra2;
	private ButtonGroup bg;
	private JButton btn1;
	
	public Suma () {
		setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 20, 50, 20);
		add(txt1);
		
		txt2 = new JTextField();
		txt2.setBounds(10, 40, 50, 20);
		add(txt2);
		
		ra1 = new JRadioButton("Sumar");
		ra1.setBounds(10, 60, 100, 20);
		add(ra1);
		ra1.addChangeListener(this);
		
		ra2 = new JRadioButton("Restar");
		ra2.setBounds(10, 90, 100, 20);
		add(ra2);
		ra2.addChangeListener(this);
		
		bg = new ButtonGroup();
		bg.add(ra1);
		bg.add(ra2);
		
		btn1 = new JButton("Probar");
		btn1.setBounds(10, 120, 100, 20);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public static void main(String [] args) {
		Suma sum = new Suma();
		sum.setBounds(0, 0, 400, 300);
		sum.setVisible(true);
		sum.setResizable(false);
		sum.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		// TODO Auto-generated method stub
		/*
		String a = txt1.getText();
		String b = txt2.getText();
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int suma = x+y;
		int resta = x-y;
		
		if (ra1.isSelected()) {
			setTitle(String.valueOf(suma));
		}
		if (ra2.isSelected()) {
			setTitle(String.valueOf(resta));
		}
		*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		String a = txt1.getText();
		String b = txt2.getText();
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int suma = x+y;
		int resta = x-y;
		
		if (e.getSource()==btn1) {
			if (ra1.isSelected()) {
				setTitle(String.valueOf(suma));
			}
			if (ra2.isSelected()) {
				setTitle(String.valueOf(resta));
			}
			
			
		}
		
		
		
	}
}
