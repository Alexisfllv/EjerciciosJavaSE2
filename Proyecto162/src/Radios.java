import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Radios extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JRadioButton rdA;
	private JRadioButton rdB;
	private JRadioButton rdC;
	private JComboBox cmbPesos;
	private JComboBox cmbCentavos;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radios frame = new Radios();
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
	public Radios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdA = new JRadioButton("Bebida A");
		rdA.setSelected(true);
		buttonGroup.add(rdA);
		rdA.setBounds(28, 81, 103, 21);
		contentPane.add(rdA);
		
		rdB = new JRadioButton("Bebida B");
		buttonGroup.add(rdB);
		rdB.setBounds(28, 135, 103, 21);
		contentPane.add(rdB);
		
		rdC = new JRadioButton("Bebida C");
		buttonGroup.add(rdC);
		rdC.setBounds(28, 185, 103, 21);
		contentPane.add(rdC);
		
		JLabel lblNewLabel = new JLabel("Pesos");
		lblNewLabel.setBounds(232, 85, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Centavos");
		lblNewLabel_1.setBounds(232, 121, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		cmbPesos = new JComboBox();
		cmbPesos.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		cmbPesos.setBounds(326, 81, 80, 21);
		contentPane.add(cmbPesos);
		
		cmbCentavos = new JComboBox();
		cmbCentavos.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30", "40", "50","60","70"}));
		cmbCentavos.setBounds(326, 117, 80, 21);
		contentPane.add(cmbCentavos);
		
		JButton btnNewButton = new JButton("Extraer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Funcion del boton
				
				int pesos = Integer.parseInt(cmbPesos.getSelectedItem().toString());
				int centavos = Integer.parseInt(cmbCentavos.getSelectedItem().toString());
				
				
				if (rdA.isSelected() && pesos ==0 && centavos==70) {
					lbl1.setText("Correcto");
				}else if (rdB.isSelected()&& pesos == 1 && centavos ==20) {
					lbl1.setText("Correcto");
				}else if (rdC.isSelected()&& pesos == 3 && centavos == 10) {
					lbl1.setText("Correto");
				}else {
					lbl1.setText("Incorrecto");
				}
				
				
			}
		});
		btnNewButton.setBounds(42, 283, 85, 21);
		contentPane.add(btnNewButton);
		
		lbl1 = new JLabel("Resultado");
		lbl1.setBounds(232, 287, 203, 13);
		contentPane.add(lbl1);
	}
}
