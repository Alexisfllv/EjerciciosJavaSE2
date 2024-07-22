import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Form extends JFrame {

	private JPanel contentPane;
	private JSpinner sp1;
	private JComboBox combo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Velocidad de desplazamiento");
		lblNewLabel.setBounds(89, 129, 191, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccion de boton");
		lblNewLabel_1.setBounds(350, 129, 168, 13);
		contentPane.add(lblNewLabel_1);
		
		sp1 = new JSpinner();
		sp1.setModel(new SpinnerNumberModel(0, 0, 100, 25));
		sp1.setBounds(114, 152, 72, 20);
		contentPane.add(sp1);
		
		combo = new JComboBox();
		combo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//
				repaint();
			}
		});
		combo.setModel(new DefaultComboBoxModel(new String[] {"Izquierdo", "Derecho"}));
		combo.setBounds(344, 152, 113, 21);
		contentPane.add(combo);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		//int sp = Integer.parseInt(sp1.toString());
		g.setColor(Color.black);
		g.drawRect(350, 220, 120, 150);
	
		
		
		//
		if (combo.getSelectedItem().toString().equals("Izquierdo")) {
			
			//	
			g.fillRect(350, 220, 60, 60);
			g.setColor(Color.red);
			g.fillOval(350, 220, 60, 60);
		}else {
			g.fillRect(410, 220, 60, 60);
			g.setColor(Color.red);
			g.fillOval(410, 220, 60, 60);
		}
		
		
	}

	
	
	//
	
}
