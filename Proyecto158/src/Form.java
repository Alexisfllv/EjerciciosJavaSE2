import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtResultado;

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
		setBounds(100, 100, 440, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(82, 147, 240, 96);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(82, 271, 240, 96);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Ingrese Usuario:");
		lblNewLabel.setBounds(92, 21, 169, 28);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(206, 26, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblIngreseClave = new JLabel("Ingrese Clave:");
		lblIngreseClave.setBounds(92, 59, 169, 28);
		contentPane.add(lblIngreseClave);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(206, 64, 96, 19);
		contentPane.add(txt2);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(92, 97, 169, 28);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(206, 102, 96, 19);
		contentPane.add(txtResultado);
	}
}
