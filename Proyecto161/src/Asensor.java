import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Asensor extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asensor frame = new Asensor();
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
	public Asensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Piso:");
		lblNewLabel.setBounds(276, 102, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblpiso = new JLabel("");
		lblpiso.setBounds(351, 102, 45, 13);
		contentPane.add(lblpiso);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(276, 151, 45, 13);
		contentPane.add(lblDireccion);
		
		JLabel lbldir = new JLabel("---");
		lbldir.setBounds(351, 151, 117, 13);
		contentPane.add(lbldir);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				//
				int piso = Integer.parseInt(txt1.getText());
				int valor =Integer.parseInt(btnNewButton_1.getText());
				
				//
				
				if (piso == valor) {
					lbldir.setText("Piso Actual");
				}else if (piso+1>valor) {
					lbldir.setText("Sube");
				}else if (piso-1<valor) {
					lbldir.setText("Baja");
				}
			}
		});
		btnNewButton_1.setBounds(40, 124, 55, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				int piso = Integer.parseInt(txt1.getText());
				int valor =Integer.parseInt(btnNewButton_2.getText());
				
				//
				
				if (piso == valor) {
					lbldir.setText("Piso Actual");
				}else if (piso+1>valor) {
					lbldir.setText("Sube");
				}else if (piso-1<valor) {
					lbldir.setText("Baja");
				}
					
				}
			});
	
		btnNewButton_2.setBounds(40, 190, 55, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				int piso = Integer.parseInt(txt1.getText());
				int valor =Integer.parseInt(btnNewButton_3.getText());
				
				//
				
				if (piso == valor) {
					lbldir.setText("Piso Actual");
				}else if (piso+1>valor) {
					lbldir.setText("Sube");
				}else if (piso-1<valor) {
					lbldir.setText("Baja");
				}
			
				
			}
		});
		btnNewButton_3.setBounds(40, 261, 55, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("4");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//
				int piso = Integer.parseInt(txt1.getText());
				int valor =Integer.parseInt(btnNewButton_1_1.getText());
				
				//
				
				if (piso == valor) {
					lbldir.setText("Piso Actual");
				}else if (piso+1>valor) {
					lbldir.setText("Sube");
				}else if (piso-1<valor) {
					lbldir.setText("Baja");
				}
			}
		});
		btnNewButton_1_1.setBounds(40, 66, 55, 40);
		contentPane.add(btnNewButton_1_1);
		
		txt1 = new JTextField();
		txt1.setBounds(434, 99, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
	}
}
