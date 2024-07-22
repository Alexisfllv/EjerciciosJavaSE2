import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cuenta extends JFrame {

	private JPanel contentPane;
	private JComboBox cmbExtraer;
	private JComboBox cmbTipo;
	private JButton btnRetiro;
	private JLabel lblResultado;
	private JLabel lblNum;
	
	private int dinero=3000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuenta frame = new cuenta();
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
	public cuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dinero a extreaer");
		lblNewLabel.setBounds(118, 153, 133, 13);
		contentPane.add(lblNewLabel);
		
		cmbExtraer = new JComboBox();
		cmbExtraer.setModel(new DefaultComboBoxModel(new String[] {"100", "200", "300", "400", "500"}));
		cmbExtraer.setBounds(118, 184, 83, 21);
		contentPane.add(cmbExtraer);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta");
		lblTipoDeCuenta.setBounds(282, 153, 133, 13);
		contentPane.add(lblTipoDeCuenta);
		
		cmbTipo = new JComboBox();
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"Caja Ahorro", "Caja Gasto", "Caja Vacio"}));
		cmbTipo.setBounds(282, 184, 83, 21);
		contentPane.add(cmbTipo);
		
		btnRetiro = new JButton("Extraer");
		btnRetiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				//Identificar
				//String caja = String.valueOf(cmbTipo.getSelectedItem());
				int valor = Integer.parseInt(cmbExtraer.getSelectedItem().toString());
				int caja11=0;
				int res=0;
				
				if (valor > dinero) {
					lblResultado.setText("Cajero fuera de servicio");
				}else {
					String tipoCuenta = cmbTipo.getSelectedItem().toString();
					if (tipoCuenta.equals("Caja Ahorro")&& valor<=200) {
						lblResultado.setText("Correcto");
						dinero = dinero- valor;
						lblNum.setText(String.valueOf(dinero));
					}else if (tipoCuenta.equals("Caja Gasto")&& valor <=500) {
						lblResultado.setText("Correcto");
						dinero = dinero - valor;
						lblNum.setText(String.valueOf(dinero));
					}else {
						lblResultado.setText("Monto muy grande");
					}
				}
				
				
			}
		});
		btnRetiro.setBounds(116, 272, 85, 21);
		contentPane.add(btnRetiro);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(223, 276, 133, 13);
		contentPane.add(lblResultado);
		
		lblNum = new JLabel("Resultado");
		lblNum.setBounds(367, 276, 133, 13);
		contentPane.add(lblNum);
	}
}
