import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Rad extends JFrame implements ChangeListener{
	
	private JRadioButton ra1,ra2,ra3;
	private JButton btn1;
	private ButtonGroup bg;
	
	
	public Rad() {
		setLayout(null);
		
		ra1 = new JRadioButton("640*480");
		ra1.setBounds(10, 20, 100, 30);
		add(ra1);
		ra1.addChangeListener(this);
		
		ra2 = new JRadioButton("800*600");
		ra2.setBounds(10, 60, 100, 30);
		add(ra2);
		ra2.addChangeListener(this);
		
		ra3 = new JRadioButton("1020*830");
		ra3.setBounds(10, 100, 100, 30);
		add(ra3);
		ra3.addChangeListener(this);
	
		bg = new ButtonGroup();
		bg.add(ra1);
		bg.add(ra2);
		bg.add(ra3);
		
	}
	
	
	public static void main(String [] args) {
		Rad rd = new Rad();
		rd.setBounds(0, 0, 350, 250);
		rd.setVisible(true);
		rd.setResizable(false);
		rd.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if (ra1.isSelected()) {
			setSize(640,480);
		}
		
		if (ra2.isSelected()) {
			setSize(800,620);
		}
		
		if (ra3.isSelected()) {
			setSize(1024,830);
		}
	}

}
