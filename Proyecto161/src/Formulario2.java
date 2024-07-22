import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario2 extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario2 frame = new Formulario2();
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
	public Formulario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Piso");
		lblNewLabel.setBounds(296, 70, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblpiso = new JLabel("1");
		lblpiso.setBounds(379, 70, 45, 13);
		contentPane.add(lblpiso);
		
		JLabel lblnew = new JLabel("Direccion");
		lblnew.setBounds(296, 116, 45, 13);
		contentPane.add(lblnew);
		
		JLabel lbldireccion = new JLabel(":");
		lbldireccion.setBounds(379, 116, 175, 13);
		contentPane.add(lbldireccion);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				
				int piso = Integer.parseInt(lblpiso.getText());
				if (piso<4) {
					lbldireccion.setText("Suba");
				}else {
					lbldireccion.setText("Piso Actual");
				}
				
				lblpiso.setText("4");
			}
		});
		btn4.setBounds(33, 70, 85, 46);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//
				
				//
				int piso = Integer.parseInt(lblpiso.getText());
				
				if (3>piso) {
					lbldireccion.setText("sube");
				}else {
					if (3<piso) {
						lbldireccion.setText("baja");
					}else {
						lbldireccion.setText("Piso Actual");
					}
				}
				
				lblpiso.setText("3");
			}
		});
		btn3.setBounds(33, 138, 85, 46);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				int piso = Integer.parseInt(lblpiso.getText());
				int boton = Integer.parseInt(btn2.getText());
				
				if (2>piso) {
					lbldireccion.setText("sube");
				}else {
					if (2<piso) {
						lbldireccion.setText("baja");
					}else {
						lbldireccion.setText("Piso Actual");
					}
				}
				
				lblpiso.setText("2");
				
				
			}
		});
		btn2.setBounds(33, 204, 85, 46);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//
				int piso = Integer.parseInt(lblpiso.getText());
				
				if (piso>1) {
					lbldireccion.setText("Baje");
				}else {
					lbldireccion.setText("Piso Actual");
				}
				
				lblpiso.setText("1");
			}
		});
		btn1.setBounds(33, 260, 85, 46);
		contentPane.add(btn1);
	}
}
