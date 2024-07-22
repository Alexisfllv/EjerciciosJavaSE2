import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

	private JPanel contentPane;
	private int columna = 350;

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
		setBounds(100, 100, 1027, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIz = new JButton("IZQUIERDA");
		btnIz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				columna = columna -150;
				repaint();
				
			}
		});
		btnIz.setBounds(166, 142, 85, 21);
		contentPane.add(btnIz);
		
		JButton btnDer = new JButton("DERECHA");
		btnDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				columna = columna +150;
				repaint();
			}
		});
		btnDer.setBounds(429, 147, 103, 16);
		contentPane.add(btnDer);
	}
	//

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.setColor(Color.red);
		g.fillOval(columna, 200, 40, 40);
	}
	
}
