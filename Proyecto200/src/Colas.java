import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.event.ActionEvent;

public class Colas extends JFrame {

	private JPanel contentPane;
	private JLabel l3;
	private JLabel l2;
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colas frame = new Colas();
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
	public Colas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Simulacion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				simular();
				
				
			}

			private void simular() {
				// TODO Auto-generated method stub
				int estado = 0;
				int llegada = 2 + (int)(Math.random()*2);
				int salida = -1;
				int cantAtendidadas =  0;
				Queue<Integer> cola = new LinkedList<Integer>();
				for (int i = 0; i < 600; i++) {
					if (llegada == i) {
						if (estado == 0) {
							estado = 1;
							salida = i + 2 + (int) (Math.random() * 3);
						}else {
							cola.add(i);
						}
						llegada = i + 2 + (int)(Math.random()*2);
					}
					if (salida == i) {
						estado = 0;
						cantAtendidadas++;
						if (!cola.isEmpty()) {
							cola.poll();
							estado = 1;
							salida = i + 2 + (int) (Math.random() * 3);
						}
					}
				}
				
				l1.setText("Atendidos : " + String.valueOf(cantAtendidadas));
				l2.setText("En cola  " + String.valueOf(cola.size()));
				if (!cola.isEmpty()) {
					l3.setText("Minuto Llegada : " + String.valueOf(cola.peek()));
				}
				
				
				
			}
		});
		btnNewButton.setBounds(153, 295, 85, 21);
		contentPane.add(btnNewButton);
		
		l1 = new JLabel("Clientes atendidos");
		l1.setBounds(82, 72, 142, 32);
		contentPane.add(l1);
		
		l2 = new JLabel("En cola");
		l2.setBounds(82, 127, 142, 32);
		contentPane.add(l2);
		
		l3 = new JLabel("Minuto de llegada");
		l3.setBounds(82, 188, 142, 32);
		contentPane.add(l3);
	}
}
