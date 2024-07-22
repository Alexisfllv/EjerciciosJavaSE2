import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author alexi
 *
 */
public class Graficos extends JFrame {

	private JPanel contentPane;
	private JTextField txt3;
	private JTextField txt1;
	private JTextField txt2;
	private JButton btnGraficar;

	private boolean graficar = false;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficos frame = new Graficos();
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
	public Graficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 739);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(223, 242, 96, 19);
		contentPane.add(txt3);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(223, 127, 96, 19);
		contentPane.add(txt1);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(223, 182, 96, 19);
		contentPane.add(txt2);
		
		JLabel lblNewLabel = new JLabel("Partido 1 :");
		lblNewLabel.setBounds(65, 127, 112, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido = new JLabel("Partido 2 :");
		lblPartido.setBounds(65, 182, 112, 34);
		contentPane.add(lblPartido);
		
		JLabel lblPartido_1 = new JLabel("Partido 3 :");
		lblPartido_1.setBounds(65, 242, 112, 34);
		contentPane.add(lblPartido_1);
		
		btnGraficar = new JButton("New button");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				graficar = true;
				repaint();
				
				
			}
		});
		btnGraficar.setBounds(65, 322, 85, 21);
		contentPane.add(btnGraficar);
	}

	
	
	//
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
			
			//
			int t1 = v1 *500 / suma;
			int t2 = v2 *500 / suma;
			int t3 = v3 *500 / suma;
			
			//porc
			
			int p1 = v1*100/suma;
			int p2 = v2*100/suma;
			int p3 = v3*100/suma;
			
			
			g.setColor(Color.red);
			g.fillRect(120, 450, t1, 40);
			g.setColor(Color.white);
			g.drawString(p1+"%", 130, 470);
			
			
			g.setColor(Color.green);
			g.fillRect(120+t1, 450, t2, 40);
			g.setColor(Color.white);
			g.drawString(p2+"%", 130+t1, 470);
			
			g.setColor(Color.blue);
			g.fillRect(120+t1+t2, 450, t3, 40);
			g.setColor(Color.black);
			g.drawString(p3+"%", 130+t1+t2, 470);
			
		}
		
	}
	

}
