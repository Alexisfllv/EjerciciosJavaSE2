import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

	private JPanel contentPane;
	private JSpinner sp1;
	private JSpinner sp2;
	private JComboBox cmbo;

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
		setBounds(100, 100, 774, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoja");
		lblNewLabel.setBounds(80, 95, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblMargenInferior = new JLabel("Margen Inferior");
		lblMargenInferior.setBounds(180, 298, 117, 13);
		contentPane.add(lblMargenInferior);
		
		JLabel lblHoja = new JLabel("MARGEN SUPERIOR");
		lblHoja.setBounds(180, 136, 117, 13);
		contentPane.add(lblHoja);
		
		JLabel lblHorientacionDeLa = new JLabel("Horientacion de la pagina");
		lblHorientacionDeLa.setBounds(396, 95, 168, 13);
		contentPane.add(lblHorientacionDeLa);
		
		cmbo = new JComboBox();
		cmbo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				//
				repaint();
			}
		});
		cmbo.setModel(new DefaultComboBoxModel(new String[] {"Horizontal", "Vertical"}));
		cmbo.setBounds(402, 136, 154, 21);
		contentPane.add(cmbo);
		
		sp1 = new JSpinner();
		sp1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//
				repaint();
			}
		});
		sp1.setModel(new SpinnerNumberModel(0, 0, 200, 1));
		sp1.setBounds(201, 166, 50, 20);
		contentPane.add(sp1);
		
		sp2 = new JSpinner();
		sp2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//
				repaint();
			}
		});
		sp2.setModel(new SpinnerNumberModel(0, 0, 200, 1));
		sp2.setBounds(206, 331, 45, 20);
		contentPane.add(sp2);
		
		JButton btnIni = new JButton("Inicializar");
		btnIni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				sp1.setValue(0);
				sp2.setValue(0);
				cmbo.setSelectedIndex(0);
				repaint();
			}
		});
		btnIni.setBounds(58, 413, 85, 21);
		contentPane.add(btnIni);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		//
		
		g.setColor(Color.blue);
		g.drawRect(30, 150, 160, 200);
		//g.drawRect(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		
		int spp1 = Integer.parseInt(sp1.getValue().toString());
		int spp2 = Integer.parseInt(sp2.getValue().toString());
		
		g.setColor(Color.red);
		g.drawLine(30, 150+spp1, 190, 150+spp1);
		g.drawLine(30, 350-spp2, 190, 350-spp2);
		//g.drawLi
		
		String direccion = cmbo.getSelectedItem().toString();
		
		if (direccion.equals("Horizontal")) {
			g.drawRect(400, 250, 200, 100);
		}else {
			g.drawRect(400, 250, 100, 200);
		}
		
	}
	
	//
	
}
