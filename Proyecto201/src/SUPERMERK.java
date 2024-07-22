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

public class SUPERMERK extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUPERMERK frame = new SUPERMERK();
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
	public SUPERMERK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Simulacion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///
				simulacion();

			}
		});
		btnNewButton.setBounds(83, 53, 85, 21);
		contentPane.add(btnNewButton);

		l1 = new JLabel("Cliente atendidos por caja:");
		l1.setBounds(37, 144, 641, 43);
		contentPane.add(l1);

		l2 = new JLabel("Cantidad de clientes que se marchan:");
		l2.setBounds(37, 197, 561, 43);
		contentPane.add(l2);

		l3 = new JLabel("Tiempo promedio de cola : ");
		l3.setBounds(37, 260, 658, 43);
		contentPane.add(l3);
	}

	protected void simulacion() {
		// TODO Auto-generated method stub
		
		//
		int estado1=0,estado2 =0,estado3 = 0;
		int marchan=0;
		int llegada = 2 +(int)(Math.random()*2);
		
		int salida1 =  -1 , salida2=-1,salida3 =-1;
		int cantAtendidas1 =0, cantAtendidas2 = 0 , cantAtendidas3=0;
		
		int timepoEnCola = 0 ;
		int cantiEnCola = 0;
		Queue<Integer> cola1 = new LinkedList<Integer>();
		Queue<Integer> cola2 = new LinkedList<Integer>();
		Queue<Integer> cola3 = new LinkedList<Integer>();
		for (int minuto = 0; minuto < 600; minuto++) {
			if (llegada == minuto) {
				if (estado1 == 0) {
					estado1 =1;
					salida1 = minuto+7+(int)(Math.random()*5);
				}else {
					if (estado2 == 0) {
						estado2 =1;
						salida2 = minuto+7+(int)(Math.random()*5);
					}else {
						if (estado3 ==0) {
							estado3 =1;
							salida3 = minuto+7+(int)(Math.random()*5);
						}else {
							if (cola1.size()==6 && cola2.size() == 6 && cola3.size()==6) {
								marchan++;
							}else {
								if (cola1.size() < cola2.size() && cola1.size() < cola3.size()) {
									cola1.add(minuto);
								}else {
									if (cola2.size() < cola3.size()) {
										cola2.add(minuto);
									}else {
										cola3.add(minuto);
									}
								}
							}
						}
					}
					
				}
				llegada =  minuto + 2 + (int)(Math.random()*2);
			}
			
			if (salida1 == minuto) {
				cantAtendidas1++;
				estado1= 0;
				if (!cola1.isEmpty()) {
					estado1=1;
					int m =cola1.poll();
					salida1 = minuto+7+(int)(Math.random()*5);
					timepoEnCola =  timepoEnCola + (minuto-m);
					cantiEnCola++;
				}
			}
			if (salida2 == minuto) {
				cantAtendidas2++;
				estado2= 0;
				if (!cola2.isEmpty()) {
					estado2=1;
					int m =cola2.poll();
					salida2 = minuto+7+(int)(Math.random()*5);
					timepoEnCola =  timepoEnCola + (minuto-m);
					cantiEnCola++;
				}
			}
			if (salida3 == minuto) {
				cantAtendidas3++;
				estado3= 0;
				if (!cola3.isEmpty()) {
					estado3=1;
					int m =cola3.poll();
					salida3 = minuto+7+(int)(Math.random()*5);
					timepoEnCola =  timepoEnCola + (minuto-m);
					cantiEnCola++;
				}
			}
				
		
		}
		l1.setText("Caja 1 : " +cantAtendidas1 + " Caja 2 :" + cantAtendidas2 + " Caja 3 : " + cantAtendidas3);
		l2.setText("Cantidad de personas que se marchan sin hacer compras : " + marchan);
		int tiempoProm = timepoEnCola/cantiEnCola;
		l3.setText("Tiempo promedio cola es : " +tiempoProm);
		
		
		}
}
