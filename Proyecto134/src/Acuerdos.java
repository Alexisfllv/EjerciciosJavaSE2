import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Acuerdos extends JFrame implements ChangeListener,ActionListener{

	private JLabel lbl1;
	private JCheckBox ch1;
	private JButton btn1;
	
	public Acuerdos() {
		setLayout(null);
		
		lbl1 = new JLabel("Acepta todos los terminos?");
		lbl1.setBounds(10, 10, 400, 30);
		add(lbl1);
		
		ch1 = new JCheckBox("Acepto");
		ch1.setBounds(10, 50, 100, 30);
		add(ch1);
		ch1.addChangeListener(this);
		
		btn1 = new JButton("Confirmar");
		btn1.setBounds(10, 100, 100, 30);
		btn1.setEnabled(false);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	
	public static void main(String [] args) {
		//
		Acuerdos ac = new Acuerdos();
		ac.setBounds(0, 0, 350, 200);
		ac.setVisible(true);
		ac.setResizable(false);
		ac.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if (ch1.isSelected()) {
			btn1.setEnabled(true);
		}else {
			btn1.setEnabled(false);
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn1) {
			setTitle("Gracias.");
		}
	}
}
