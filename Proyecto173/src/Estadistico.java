import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Estadistico extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt3;
	private JTextField txt2;
	private JButton btnGraficar;

	
	//
	
	private boolean graficar = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estadistico frame = new Estadistico();
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
	public Estadistico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1 :");
		lblNewLabel.setBounds(58, 106, 79, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido = new JLabel("Partido 2 :");
		lblPartido.setBounds(58, 172, 79, 27);
		contentPane.add(lblPartido);
		
		JLabel lblPartido_1 = new JLabel("Partido 3 :");
		lblPartido_1.setBounds(58, 240, 79, 27);
		contentPane.add(lblPartido_1);
		
		btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				
				graficar= true;
				repaint();
				
				
				
			}
		});
		btnGraficar.setBounds(46, 297, 85, 21);
		contentPane.add(btnGraficar);
		
		txt1 = new JTextField();
		txt1.setBounds(143, 110, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(147, 176, 96, 19);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(147, 244, 96, 19);
		contentPane.add(txt3);
	}

	
	//metodo paint
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		if (graficar) {
			//identar
			int v1 = Integer.parseInt(txt1.getText());
			int v2 = Integer.parseInt(txt2.getText());
			int v3 = Integer.parseInt(txt3.getText());
			
			int suma = v1+v2+v3;
			
			int grados1= v1*360/suma;
			int grados2= v2*360/suma;
			int grados3= v3*360/suma;
			
			g.setColor(Color.red);
			g.fillArc(100, 350, 200, 200, 0, grados1);
			g.fillRect(370, 350, 20, 20);
			g.drawString("Partido 1", 400, 370);
			
			g.setColor(Color.green);
			g.fillArc(100, 350, 200, 200, grados1, grados2);
			g.fillRect(370, 380, 20, 20);
			g.drawString("Partido 2", 400, 400);
			
			g.setColor(Color.blue);
			g.fillArc(100, 350, 200, 200, grados1+grados2, grados3);
			g.fillRect(370, 410, 20, 20);
			g.drawString("Partido 3", 400, 430);
		}
		
	}
	
	
	
	
	
	
}
