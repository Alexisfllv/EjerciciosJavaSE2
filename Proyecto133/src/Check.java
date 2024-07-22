import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Check extends JFrame implements ChangeListener{

	
	private JCheckBox ch1,ch2,ch3;
	
	
	public Check() {
	
		setLayout(null);
		
		ch1 = new JCheckBox("Ingles");
		ch1.setBounds(10, 10, 150, 30);
		add(ch1);
		ch1.addChangeListener(this);
		
		ch2 = new JCheckBox("Frances");
		ch2.setBounds(10, 50, 150, 30);
		add(ch2);
		ch2.addChangeListener(this);
		
		ch3 = new JCheckBox("Español");
		ch3.setBounds(10, 90, 150, 30);
		add(ch3);
		ch3.addChangeListener(this);
		
		
	}
	
	public static void main(String [] args) {
		//
		Check ch = new Check();
		ch.setBounds(0, 0, 400, 300);
		ch.setVisible(true);
		ch.setResizable(false);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		String cad = "";
		if (ch1.isSelected()) {
			cad+= "Check1";
		}
		
		if (ch2.isSelected()) {
			cad+="Check2";
		}
		if (ch3.isSelected()) {
			cad+="Check3";
		}
		
		setTitle(cad);
		
		
	}
}
