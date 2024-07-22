import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Fili extends JFrame implements ItemListener{
	
	private JComboBox<String> cmb1;
	
	public Fili() {
		setLayout(null);
		
		cmb1 = new JComboBox<String>();
		cmb1.setBounds(10, 10, 80, 20);
		add(cmb1);
		cmb1.addItem("Alexis");
		cmb1.addItem("Azul");
		cmb1.addItem("Low");
		cmb1.addItemListener(this);
	}
	
	public static void main(String [] args) {
		Fili fil = new Fili();
		fil.setBounds(0, 0, 300, 200);
		fil.setVisible(true);
		fil.setResizable(false);
		fil.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		String tcmb;
		if (e.getSource()==cmb1) {
			tcmb = cmb1.getSelectedItem().toString();
			setTitle(tcmb);
		}
	}

}
