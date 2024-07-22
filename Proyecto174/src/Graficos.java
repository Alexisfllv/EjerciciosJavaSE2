import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graficos extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

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
		setBounds(100, 100, 800, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Partido 1 :");
		lblNewLabel.setBounds(83, 117, 112, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblPartido = new JLabel("Partido 2 :");
		lblPartido.setBounds(83, 172, 112, 34);
		contentPane.add(lblPartido);
		
		JLabel lblPartido_1 = new JLabel("Partido 3 :");
		lblPartido_1.setBounds(83, 232, 112, 34);
		contentPane.add(lblPartido_1);
		
		txt1 = new JTextField();
		txt1.setBounds(241, 117, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(241, 172, 96, 19);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(241, 232, 96, 19);
		contentPane.add(txt3);
		
		JButton btnGraficar = new JButton("Graficar");
		btnGraficar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				graficar = true;
				repaint();
				
			}
		});
		btnGraficar.setBounds(83, 305, 85, 21);
		contentPane.add(btnGraficar);
	}

	
	//
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		//
		
		if (graficar) {
			
			int val1 = Integer.parseInt(txt1.getText());
			int val2 = Integer.parseInt(txt2.getText());
			int val3 = Integer.parseInt(txt3.getText());
			
			int mayor = retornarMayor(val1,val2,val3);
			
			int largo1= val1*400/mayor;
			int largo2= val2*400/mayor;
			int largo3= val3*400/mayor;
			
			g.setColor(Color.red);
			g.fillRect(120, 450, largo1, 40);
			g.drawString("Partido 1", 30, 470);
			
			g.setColor(Color.green);
			g.fillRect(120, 500, largo2, 40);
			g.drawString("Partido 2", 30, 520);
			
			g.setColor(Color.blue);
			g.fillRect(120, 550, largo3, 40);
			g.drawString("Partido 3", 30, 570);
		}
		
	}
	
	
	//metodo
	
	private int retornarMayor(int a,int b,int c){
		
		int mayor=0;
		if (a>b && a >c) {
			return a;
		}else {
			if (b>c) {
				return b;
			}else {
				return c;
			}
		}
	}
	

}
