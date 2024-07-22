import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tryyo extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JLabel lblRep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tryyo frame = new tryyo();
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
	public tryyo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(311, 55, 176, 41);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setBounds(109, 58, 146, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor 2");
		lblValor.setBounds(109, 109, 146, 35);
		contentPane.add(lblValor);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(311, 106, 176, 41);
		contentPane.add(txt2);
		
		JButton btnDiv = new JButton("Dividir");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cad1 =  txt1.getText();
				String cad2 =  txt2.getText();
				
				
				
				try {
					
					int valor1 = Integer.parseInt(cad1);
					int valor2 = Integer.parseInt(cad2);
					
					int res = valor1/valor2;
					lblRep.setText(String.valueOf(res));
					
					
					
				} catch (NumberFormatException ex) {
					setTitle("Ingrese numeros ");
				}catch (ArithmeticException ex) {
					setTitle("No se puede dividir por cero");
				}
				 
				
				
			}
		});
		btnDiv.setBounds(183, 203, 118, 64);
		contentPane.add(btnDiv);
		
		lblRep = new JLabel(">>>>>>>>>");
		lblRep.setBounds(618, 83, 89, 28);
		contentPane.add(lblRep);
	}
}
