import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese valor 1 ");
		lblNewLabel.setBounds(67, 65, 104, 23);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(181, 67, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblIngreseValor = new JLabel("ingrese valor 2");
		lblIngreseValor.setBounds(67, 109, 104, 23);
		contentPane.add(lblIngreseValor);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(181, 111, 96, 19);
		contentPane.add(txt2);
		
		JLabel label1 = new JLabel("RES:");
		label1.setBounds(340, 186, 192, 13);
		contentPane.add(label1);
		
		JButton btnNewButton = new JButton("Action");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//codigo para realizar el resutaldo
				
				//valores
				
				String t1 = txt1.getText();
				String t2 = txt2.getText();
				
				String res;
				
				int v1 = Integer.parseInt(t1);
				int v2 = Integer.parseInt(t2);
				
				
				int suma =v1+v2;
				
				String ress = String.valueOf(suma);
				
				txtresultado.setText("Res" + suma);
				label1.setText("Resultado : " + suma);
				
				
				//
			}
		});
		btnNewButton.setBounds(192, 157, 85, 21);
		contentPane.add(btnNewButton);
		
		txtresultado = new JTextField();
		txtresultado.setBounds(181, 204, 96, 19);
		contentPane.add(txtresultado);
		txtresultado.setColumns(10);
		
		
	}
}
