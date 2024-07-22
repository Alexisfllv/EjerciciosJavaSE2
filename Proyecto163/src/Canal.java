import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Canal extends JFrame {

	private JPanel contentPane;
	private JSpinner sp1;
	private JSpinner sp3;
	private JSpinner sp2;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Canal frame = new Canal();
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
	public Canal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Compuerta 1");
		lblNewLabel.setBounds(404, 160, 103, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblCompuerta = new JLabel("Compuerta 2");
		lblCompuerta.setBounds(404, 200, 103, 13);
		contentPane.add(lblCompuerta);
		
		JLabel lblCompuerta_1 = new JLabel("Compuerta 3");
		lblCompuerta_1.setBounds(404, 239, 103, 13);
		contentPane.add(lblCompuerta_1);
		
		sp1 = new JSpinner();
		sp1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		sp1.setBounds(262, 157, 79, 20);
		contentPane.add(sp1);
		
		sp2 = new JSpinner();
		sp2.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		sp2.setBounds(262, 197, 79, 20);
		contentPane.add(sp2);
		
		sp3 = new JSpinner();
		sp3.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		sp3.setBounds(262, 236, 79, 20);
		contentPane.add(sp3);
		
		JButton btn1 = new JButton("Actualizar Caudal");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				int v1 = Integer.parseInt(sp1.getValue().toString());
				int v2 = Integer.parseInt(sp2.getValue().toString());
				int v3 = Integer.parseInt(sp3.getValue().toString());
				int suma = v1+v2+v3;
				
				if (suma <= 100) {
					lbl1.setText("Bajo");
				}else if (suma <=200) {
					lbl1.setText("Medio");
				}else {
					lbl1.setText("Alto");
				}
				
			}
		});
		btn1.setBounds(166, 340, 231, 21);
		contentPane.add(btn1);
		
		lbl1 = new JLabel("Resultado");
		lbl1.setBounds(454, 331, 115, 38);
		contentPane.add(lbl1);
	}
}
