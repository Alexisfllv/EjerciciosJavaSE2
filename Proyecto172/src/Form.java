import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

	private JPanel contentPane;
	private JComboBox combo;
	private JSpinner sp;
	private JButton btnNewButton;
	
	private int sorteo;
	private int revisados=0;
	private int norevisados=0;

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
		setBounds(100, 100, 688, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad de bultos");
		lblNewLabel.setBounds(84, 130, 112, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblProcedencia = new JLabel("Procedencia");
		lblProcedencia.setBounds(260, 130, 112, 13);
		contentPane.add(lblProcedencia);
		
		sp = new JSpinner();
		sp.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		sp.setBounds(72, 167, 79, 20);
		contentPane.add(sp);
		
		combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] {"Interior", "Exterior"}));
		combo.setBounds(217, 166, 89, 21);
		contentPane.add(combo);
		
		btnNewButton = new JButton("Sortear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				
				int bultos = Integer.parseInt(sp.getValue().toString());
				
				if (bultos== 0 ) {
					setTitle ("Seleccion la cantidad de bultos : ");
				}else {
					sorteo = 1+(int)(Math.random()*3);
					if (sorteo==1 || bultos>5) {
						sorteo=1;
						revisados= revisados + bultos;
					}else {
						norevisados=norevisados+bultos;
					}
					setTitle("Revisados : " + revisados+ " No revisados" + norevisados);
					sp.setValue(0);
					repaint();
				}
				
				
				
			}
		});
		btnNewButton.setBounds(66, 246, 85, 21);
		contentPane.add(btnNewButton);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		///
		
		if (sorteo ==1) {
			g.setColor(Color.red);
		}else {
			g.setColor(Color.green);
		}
		
		g.fillOval(75, 320, 70, 70);
		
	}
	
	//
	

}
